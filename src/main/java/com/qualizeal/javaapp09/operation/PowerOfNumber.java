package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {

		return "power of a number is indicating how many times the value multiplies itself";

	}

	public int calculatePowerOfNumber(int num1, int num2) {

		if (num1 < 0 || num2 < 0) {
			return -1;
		}

		else if (num1 == 0 || num2 == 0) {
			return -2;
		} else {

			int res = 1;

			for (int i = 1; i <= num2; i++) {

				res *= num1;
			}

			return res;
		}

	}

}