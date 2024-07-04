package com.java_basics_and_practice_programs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {34, 56, 12, 87, 11, 93, 67};
		reverseArray(arr);
		System.out.println("Reversed Array : "+ Arrays.toString(arr));
		
	}
	
	static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		
		while(start < end) {
			swapArrayElements(arr, start, end);
			start++;
			end--;
		}
	}
	
	static void swapArrayElements(int [] arr,int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
