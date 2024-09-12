package coding_problems;

import java.util.Arrays;

public class FindMaxAndMinInArray {
    public static void main(String[] args) {

        int[] arr = { 1, 6, 3, 34, 87, 45, 4, 8 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Output:" + max + " " + min);
    }

}
