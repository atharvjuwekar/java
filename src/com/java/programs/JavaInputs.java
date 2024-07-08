package com.java.programs;

import java.util.Scanner;

public class JavaInputs {
	public static void main(String[] args) {
		System.out.println("Hello, Enter any value:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String sentence = input.nextLine();
		float marks = input.nextFloat();
		System.out.println("Entered value is : " + input.nextLine());
		
		
		
		
	}

}
