package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		//returning definition of power of numbers as text.
		return "It is a way to express repeated multiplication of a number by itself.";
	}
	
	public int calculatePowerOfNumber(int number, int exponent) {
		//returning -1, if the value passed as a parameter is a negative number.
		if(number < 0 || exponent < 0) {
			return -1;
		}
		
		if(number == 0 || exponent == 0) {
			//returning -2, if the value passed as a parameter is 0.
			return -2;
		}
		
		//Calculating the power of number.
		int power = 1;
		for(int i = 0; i < exponent; ++i) {
			power *= number;
		}
		
		//returning power of number as int.
		return power;
	}
}
