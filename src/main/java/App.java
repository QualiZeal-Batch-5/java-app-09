package com.qualizeal.javaapp09.operation;

import com.qualizeal.javaapp09.operation.PowerOfNumber;

public class App{
	public static void main(String[] args){
		
		PowerOfNumber powerOfNumber =  new PowerOfNumber();
		
		int result1 = powerOfNumber.calculatePowerOfNumber(2,1);
		
		System.out.println(result1);
		
	}
}