package com.java_basics_and_practice_programs;

import java.util.Arrays;

public class JavaArrays {
	public static void main(String[] args) {
		int arr[] = new int[4]; // array initialization
		int arr1[] = {1,2,3,4}; // alternative way
		
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr1));
		
	}

}
