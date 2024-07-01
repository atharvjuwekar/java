package java_programs;

import java.util.Scanner;

public class FindNumberOfOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = in.nextInt();
        
        System.out.println("Enter digit to find occurrences:");
        int occur = in.nextInt();
        
        int count = 0;
      
        num = Math.abs(num);
        
        while (num > 0) {
            int n = num % 10;
            if (n == occur) {
                count++;
            }
            num /= 10;
        }
        
        System.out.println("Occurrences of " + occur + " in the number are: " + count);
    }
}
