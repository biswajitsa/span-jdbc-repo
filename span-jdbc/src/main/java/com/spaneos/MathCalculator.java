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
	public int reverseOfNumber(int num){
		int dg=0,rev=0;
		while(num<0){
			dg=num%10;
			rev=rev+dg*10;
			num=num/10;
		}
		return rev;
	}

	public int factorial(int num) {
		if (num == 0 || num == 1)
			return 1;
		else
			return num * factorial(num - 1);
	}

}
