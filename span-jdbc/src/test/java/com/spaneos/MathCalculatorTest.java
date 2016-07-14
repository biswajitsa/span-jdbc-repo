package com.spaneos;

import org.junit.Test;

import junit.framework.Assert;

public class MathCalculatorTest {

		@Test
		public void getSumtTestWithPositiveNumbers(){
				int a[]=new int[]{1,2,3,4,5,6,7,8,9};
				int res=new MathCalculator().getSum(a);
				Assert.assertEquals(45, res);
		}
}
