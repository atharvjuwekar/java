package com.java.java_programs;

import java.util.Scanner;

public class MaxInArray {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		int max = arr[0];
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; 
			}
		}
		
		System.out.println("Max element :" + max);
	}
}
