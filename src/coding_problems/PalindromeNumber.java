package coding_problems;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to be checked : ");
        int num = in.nextInt();
        System.out.println("Result is :" + isPalindromeNum(num));
    }

    public static boolean isPalindromeNum(int num) {
        int temp = 0;
        int actualNum = num;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            temp = temp * 10 + rem;
        }
        return temp == actualNum;
    }

}
