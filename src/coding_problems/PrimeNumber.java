package coding_problems;

import java.util.Scanner;

public class PrimeNumber {
    

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to be checked :");
        int num = in.nextInt();
        System.out.println("Result : " + isPrimeNum(num));
        
        in.close();

    }

    public static boolean isPrimeNum(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; 
        }
        if (num % 2 == 0) {
            return false; // Exclude all other even numbers
        }

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
            
        }
        return true;
    }
}
