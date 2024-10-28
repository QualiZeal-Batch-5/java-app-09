package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	
	public String definePowerOfNumber() {
        return "The power of a number 'x' raised to 'n' is the result of multiplying 'x' by itself 'n' times.";
    }

    public int calculatePowerOfNumber(int base, int exponent) {
        
        if (base < 0 || exponent < 0) {
            return -1;  
        }
        
        if (base == 0 || exponent == 0) {
            return -2;  
        }

        long result = 1; 
        for (int i = 0; i < exponent; i++) {
            result *= base;
           
            if (result > Integer.MAX_VALUE) {
                return -1; 
            }
        }
        return (int) result;  
    }

}
