package java_programs;

import java.util.Scanner;

public class JavaInputs {
	public static void main(String[] args) {
		System.out.println("Hello, Enter any value:");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		System.out.println("Entered value is : " + input.nextLine());
		
	}

}
