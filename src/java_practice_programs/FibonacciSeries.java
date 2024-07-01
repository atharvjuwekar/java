package java_practice_programs;

import  java.util.Scanner;

public class FibonacciSeries {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Fibonacci series nth Number to print :");
		int n = in.nextInt();
		int a = 0, b=1, temp;
		
		if (n >= 1) {
			System.out.println(a);
		}
		if (n >= 2) {
			System.out.println(b);
		}
		while(n>2) {
			temp = b;
			b = a + b;
			a = temp;
			n -= 1;
			System.out.println(b);
		}
	}

}
