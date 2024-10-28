package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		return "Power of a Number";
	}

	public long calculatePowerOfNumber(int a, int b) {
		if (a < 0 || b < 0) {
			return -1;
		} else if (a == 0 || b == 0) {
			return -2;
		}
		long prod = 1;
		for (int i = 1; i <= b; i++) {
			prod = prod * a;
		}
		return prod;
	}

}
