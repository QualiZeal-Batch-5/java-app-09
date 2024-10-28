package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {

  
    public String definePowerOfNumber() {
        return "The power of a number is the result of multiplying that number by itself as many times as the exponent.";
    }

    
    public int calculatePowerOfNumber(int base, int exponent) {
        if (base < 0 || exponent < 0) {
            return -1;
        }
        if (base == 0 || exponent == 0) {
            return -2;
        }

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result*base;
        }

        return result;
    }
}
