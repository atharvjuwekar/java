package com.java_basic_concepts_and_programs;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = in.nextLine().trim().toLowerCase();
        in.close();

        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0, consCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a vowel
            boolean isVowel = false;
            for (char vowel : vowelArray) {
                if (ch == vowel) {
                    vowelCount++;
                    isVowel = true;
                    break;
                }
            }
            
            // Check if the character is a consonant
            if (!isVowel && Character.isLetter(ch)) {
                consCount++;
            }
        }

        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consCount);
    }
}
