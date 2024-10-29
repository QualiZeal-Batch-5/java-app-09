package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	
	public String definePowerOfNumber() {
		
		return "definePowerOfNumber";
		
	}
	
	public int calculatePowerOfNumber(int exponent,int power) {
		
		if (power < 0 || exponent < 0) {
			
			return -1;
			
		}
		
		if (power == 0 || exponent == 0) {
			
			return -2;
			
		}
		int result = 1;
		for (int i = 0 ; i < power; i++) {
			
			result *= exponent;
			
			
		}
		return result;
		
	}
}
