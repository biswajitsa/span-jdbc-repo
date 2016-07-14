package com.spaneos;

public class MathCalculator {

	public int getSum(int... args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		return sum;
	}

	public int singleDigitSum(int num) {

		int sum = num;
		while (num > 9) {
			sum = num % 10 + num / 10;
			num = sum;
		}
		return sum;
	}

}
