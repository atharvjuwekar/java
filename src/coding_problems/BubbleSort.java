package coding_problems;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter array :");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(bubbleSortArray(arr)));

    }

    public static int[] bubbleSortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
