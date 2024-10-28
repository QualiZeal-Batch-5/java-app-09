package com.qualizeal.javaapp09.operation;

public class PowerOfNumber {
	public String definePowerOfNumber() {
		return "Power of the number";
	}
	public int calculatePowerOfNumber(int num, int pow) {
		if (num <0 || pow < 0) {
			return -1;
		}
		else if (num ==0 || pow == 0) {
			return -2;
		}
		else {
			int result=1;
			while(pow != 0) {
				result=result*num;
				pow--;
			}
			return result;
		}
	}

}
