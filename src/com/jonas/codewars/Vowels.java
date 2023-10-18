package com.jonas.codewars;

public class Vowels {

    public static int getCount(String str) {
        int vowelCount = 0;
        for (char c : str.toCharArray()) if ("aeiouAEIOU".contains(String.valueOf(c))) vowelCount++;
        return vowelCount;
    }
}
