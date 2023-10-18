package com.jonas.codewars;

public class Troll {

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }


    // Best practise
    public static String _disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
}
