package basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
//		Matrix data
//		1 2 3
//		4 5 6 
//		7 8 9
		
//		int[][] arr = {
//				{1, 2, 3},// 0th index
//				{4, 5, 6},// 1st index
//				{7, 8, 9}// 2nd index
//		};
//		
		int[][] arr2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		
//		int [][] arr2 = new int [3][4];
		
//		for (int row=0; row< arr2.length; row++) {
//			for (int col = 0; col < arr2[row].length; col++) {
//			 	arr2[row][col] = in.nextInt();
//				
//			}	
//		}
		System.out.println("***********************");
		
		for (int row=0; row< arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}	
//			System.out.print(Arrays.toString(arr2[row]));
			System.out.println("");
		}
		System.out.println("***********************");
		
		for (int row=0; row< arr2.length; row++) {	
			System.out.print(Arrays.toString(arr2[row]));
			System.out.println("");
		}
		System.out.println("***********************");
		
		for (int[] a: arr2) {
			System.out.println(Arrays.toString(a));
		}
		
	}
}
