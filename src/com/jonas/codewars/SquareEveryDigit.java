package com.jonas.codewars;

public class SquareEveryDigit {

    public static int squareDigits(int n) {

        String temp = "";

        for (char c : Integer.toString(n).toCharArray()) {
            temp += (int) Math.pow(Character.getNumericValue(c), 2);
        }

        return Integer.parseInt(temp);
    }
}
