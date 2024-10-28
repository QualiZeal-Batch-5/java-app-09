package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	
	public String definePowerOfNumber() {
		return "The power of a number is the result of multiplying it by itself a specified number of times, expressed as a^n ";
	}
	
	public int calculatePowerOfNumber(int base , int num) {
		if(base < 0 || num < 0) 
		{
			return -1;
		}
		else if(base == 0 || num == 0) 
		{
			return -2;
		}
		else
		{
			int result=1;
			
			while(num != 0) 
			{
				result=result*base;
				num--;
			}
			
			return result;
		}
	}
}
