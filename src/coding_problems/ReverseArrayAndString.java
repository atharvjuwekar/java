package coding_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayAndString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter Array Input size:");
            int arraySize = in.nextInt();
            int[] arr = new int[arraySize];
            System.out.println("Enter Array Input values:");
            for (int i = 0; i < arraySize; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("Entered array is : " + Arrays.toString(arr));
            System.out.println("Reversed array is : " + Arrays.toString(revArray(arr)));

            System.out.println("Reversed String : " + revString("abcd"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            in.close();
        }

    }

    public static int[] revArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        return arr;
    }

    public static String revString(String str) {
        char[] revChar = str.toCharArray();
        System.out.println(Arrays.toString(revChar));
        int start = 0;
        int end = revChar.length - 1;

        while (end > start) {
            char temp = revChar[end];
            revChar[end] = revChar[start];
            revChar[start] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(revChar));

        return (new String(revChar));
    }
}
