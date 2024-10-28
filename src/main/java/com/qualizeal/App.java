package com.qualizeal;

import com.qualizeal.javaapp09.operation.PowerOfNumber;

public class App {
	
	public static void main(String[] args) {
		
		PowerOfNumber powerOfNumber = new PowerOfNumber();
		
		System.out.println(powerOfNumber.calculatePowerOfNumber(3, 5));
		
		System.out.println(powerOfNumber.definePowerOfNumber());

	}
}