package com.java.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeWordWise {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str = in.nextLine();
		in.close();
		System.out.println(
				"The given sentence reads the same forwards and backwards (word-wise): " + isWordPalindrome(str));
	}

	static boolean isWordPalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}

		String[] strArray = str.split("\\s+"); // Splitting by one or more spaces

		int start = 0;
		int end = strArray.length - 1;

		while (start < end) {
			if (!strArray[start].equals(strArray[end])) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
