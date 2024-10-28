package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		return "The power of a number is the result of multiplying a number by itself a specified number of times.";
	}
	public int calculatePowerOfNumber(int num1,int num2) {
		if(num1 < 0 || num2 < 0) {
			return -1;
		}
		else if(num1 == 0 || num2 == 0) {
			return -2;
		}
		else {
			int result = 1;
				for(int i = 0; i < num2; i++) {
					result *= num1;
				}
		return result;	
	    }	
	}
}