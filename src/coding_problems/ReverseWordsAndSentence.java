package coding_problems;

import java.util.*;

public class ReverseWordsAndSentence {

    public static void main(String[] args) {
        String str = "This is test string.";
        String[] arrStr = str.split(" ");
        StringBuffer strBuff = new StringBuffer();
        for (int i = arrStr.length - 1; i >= 0; i--) {
            strBuff.append(reverseString(arrStr[i]) + " ");
        }
        System.out.println(strBuff);

    }

    public static String reverseString(String str) {
        char arr[] = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}
