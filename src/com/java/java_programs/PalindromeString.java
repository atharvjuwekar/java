package com.java.java_programs;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = in.nextLine();
		in.close();
		System.out.println("Given String is palindrome :" + isPalindromeString(str));

	}

	static boolean isPalindromeString(String str) {
		
		if(str == null || str.isEmpty()) {
			return false;
		}

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
				start++;
				end--;
		}
		return true;
	}

}
