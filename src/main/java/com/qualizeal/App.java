package com.qualizeal;

import com.qualizeal.javaapp09.operation.PowerOfNumber;

public class App {
	public static void main(String[] args) {
		PowerOfNumber powerOfNumber = new PowerOfNumber();

		int result=powerOfNumber.calculatePowerOfNumber(2, 4);
		System.out.println(result);

	}
}