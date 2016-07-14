package com.spaneos;

public class MathCalculator{

	public int getSum(int... args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		return sum;
	}
	
	

}
