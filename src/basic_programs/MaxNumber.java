package basic_programs;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max= a;
		if(b > a) {
			max= b;
		}
		if(c > max) {
			max = c;
		}
		
		System.out.println("Max number is :" + max);
		
	}

}
