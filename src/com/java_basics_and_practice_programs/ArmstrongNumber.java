package com.java_basics_and_practice_programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
		
	}
	
	
	static boolean isArmstrong(int num) {
		int lastDigit, temp, sum = 0;
		temp = num;
		while(num > 0) {
			lastDigit = num%10;
			num /=10;
			sum = sum + (lastDigit*lastDigit*lastDigit);
		}
		
		return (temp == sum);
		
	}

}
