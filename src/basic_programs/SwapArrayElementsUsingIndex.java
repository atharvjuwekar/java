package basic_programs;

import java.util.Arrays;

public class SwapArrayElementsUsingIndex {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4};
		
		swapArrayElements(arr, 1, 3);
		System.out.println(Arrays.toString(arr));		
		
		}
	
	static void swapArrayElements(int [] arr,int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
