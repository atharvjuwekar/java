package com.java_basics_and_practice_programs;

public class PrimeNumber {
	public static void main(String[] args) {
		
		System.out.println(isPrime(31));
	}
	
	static boolean isPrime(int num) {
		boolean result = false;
		
		if (num <=1) {
			return false;
		}
				
		int i =2;
		while(i<= num/2 ) {
			if(num%i == 0) {
				return false;
			}
			i++; 
		}
		return true;
	}

}
