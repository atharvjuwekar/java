package coding_problems;

import java.util.*;

public class AnangramString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = in.nextLine().trim().toLowerCase();
        System.out.println("Enter second string : ");
        String str2 = in.nextLine().trim().toLowerCase();
        System.out.println("Result : " + isAnagramStrings(str1, str2));
        in.close();
    }

    public static boolean isAnagramStrings(String str1, String str2) {
        if (str1.length() == str2.length()) {

            char[] str1Arr = str1.toCharArray();
            char[] str2Arr = str2.toCharArray();

            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            return Arrays.equals(str1Arr, str2Arr);
        }
        return false;
    }

}
