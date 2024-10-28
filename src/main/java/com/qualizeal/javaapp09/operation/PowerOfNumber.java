package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		return "Power of Number gives you the exponent number of times Multiplication of base value.";
	}
	
	public int calculatePowerOfNumber(int base_value,int exponent_value) {
		if (base_value < 0 || exponent_value < 0) {
            return -1;
        } else if (base_value == 0 || exponent_value == 0) {
            return -2;
        } else {
        	int result = 1;
        	
        	for (int i = 0; i < exponent_value; i++) {
        		result *= base_value;
        		if (result < 0) {
        			return -1;
        		}
        	}
        	return result;
        }
	}
}
