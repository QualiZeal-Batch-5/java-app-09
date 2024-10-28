package com.qualizeal;

import com.qualizeal.javaapp09.operation.PowerOfNumber;
 
public class App {
	public static void main(String[] args) {
		PowerOfNumber powerOfNumber = new PowerOfNumber();
		int res = powerOfNumber.calculatePowerOfNumber(6,2);
		System.out.println(res);
	 }
}