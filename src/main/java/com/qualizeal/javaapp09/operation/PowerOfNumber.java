package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {

	public String definePowerOfNumber() {
		return "The power (or exponent) of a number says how many times to use the number in a multiplication.";
	}
	
	public String calculatePowerOfNumber(int num1, int num2) {
		if(num1 < 0 || num2 < 0) {
			return "-1";
		}
		else if(num1 == 0 || num2 == 0) {
			return "-2";
		}
		else if(num2 == 1){
			return "num1";
			
		}
		else {
			int power = 1;
			for(int i = 1; i <= num2; i ++ ) {
				power = power * num1;
			}
			return "power";
		}
		
	}
}
