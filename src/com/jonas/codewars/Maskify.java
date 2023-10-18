package com.jonas.codewars;

public class Maskify {
    public static String maskify(String str) {

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ((i == str.length() -1|| i == str.length() -2 )||( i == str.length() -3 || i == str.length() -4)){
                newStr += c;
            }
            else{
                newStr += "#";
            }
        }
        return newStr;
    }
}
