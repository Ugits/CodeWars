package com.jonas.codewars;

public class ToCamelCase {
    public static String toCamelCase(String s){
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '-' || c == '_') {
                char upperChar = Character.toUpperCase(s.charAt(i + 1));
                newString += upperChar;
                i++;
            } else {
                newString += c;
            }
        }
        return newString;
    }
}
