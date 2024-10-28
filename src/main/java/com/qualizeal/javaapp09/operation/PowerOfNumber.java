package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		return "PowerOfNumber:It says how many times to use the number in a multiplication.";
	}
	public int calculatePowerOfNumber(int num1,int num2) {
		if(num1 < 0 || num2 < 0) {
			return -1;
		}
		else if(num1 == 0 || num2 == 0) {
			return -2;
		}
		else {
			int result=1;
			while(num1>0) {
				result =result * num1;
				num2 = num2 - 1;
		    }
			return result;
		}
		
	}
}


