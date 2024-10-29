package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		return "Power of number";
	}
	 
	public int calculatePowerOfNumber(int base, int n) {
		if (base < 0 || n < 0) {
		return -1;
		} else if (base == 0 || n == 0) {
		return -2;
			} else {
				int result = 1;
	 
				while (n != 0) {
					result = result * base;
					n--;
				}
	 
				return result;
		}
	}
}

