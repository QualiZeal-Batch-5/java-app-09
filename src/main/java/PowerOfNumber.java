package com.qualizeal.javaapp09.operation;

import java.lang.Math;

public class PowerOfNumber{
	public String definePowerOfNumber(){
		return "The power of a number refers to the number of times a number the base";
	}
	public int calculatePowerOfNumber(int num1, int num2){
		if(num1 < 0 || num2 < 0){
			return -1;
		}
		
		else if(num1 == 0 || num2==0){
			return -2;
		}
		
		else{
			 
           int result = 1;
           for (int i = 0; i < num2; i++) {
             result *= num1;
		   }
		 return result;
	    }
	
		
	}
}