package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		return "The exponents that show how many times a base will be multiplied by itself.";
	}
	
	public int calculatePowerOfNumber(int num1, int num2) {
		int result = 1;
		
		if(num1 < 0 || num2 < 0)
			return -1;
		else if(num1 == 0 || num2 == 0) 
			return -2;
		else {
			for(int i = 1; i <= num2; i++) {
				result *= num1;
			}
			return result;
		}
	}

}
