package com.java_basic_concepts_and_programs;

import java.util.Scanner;

public class UpparCaseOrLowerCaseCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = input.nextLine().trim().charAt(0);
			if(ch >= 'a' && ch <= 'z') {
				System.out.println("lowercase");
			}
			else if(ch >= 'A' && ch <= 'Z') {
				System.out.println("Upper case");
			}
			else {
				System.out.println("Invalid input");
			}
			
			input.close();
 }
	
}
