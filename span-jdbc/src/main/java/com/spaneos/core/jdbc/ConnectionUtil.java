package com.spaneos.core.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;

public class ConnectionUtil {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionUtil.class);
	private ConnectionUtil(){
		
	}
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			LOGGER.error("While loading driver : {}",e.getMessage());
		}
	}
	
	public static Connection getConnection(){
		Connection con=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://192.168.200.117:3306/spanjdbc","root","spaneos");
		} catch (SQLException e) {
			LOGGER.info("While connecting with database : {}",e.getMessage());
		}
		return con;
	}
	
}
