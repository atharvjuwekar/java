package basic_programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string to reverse it :");
		String str1 = scan.nextLine().trim();
		String str2 = "";
		scan.close();
		
//		StringBuilder str2 = new StringBuilder();
		
		for (int i = str1.length()-1; i>=0 ; i--) {
			
			str2 = str2 + str1.charAt(i);
			
//			str2.append(str1.charAt(i));
		}
		System.out.println(str2);
	}

}
