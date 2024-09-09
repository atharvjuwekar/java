package com.java.programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = scan.nextInt();
		int revNum = 0, lastDigit  = 0;
		while(num>0) {
			lastDigit =  num % 10;
			revNum = revNum * 10 + lastDigit;
			num /= 10;
		}
		System.out.println(revNum);
	}

}
