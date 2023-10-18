package com.jonas.codewars;

import java.util.ArrayList;
import java.util.List;

public class PangramChecker {


    public static boolean check(String sentence) {
        sentence = sentence.toLowerCase();

        List<Character> alphabet = new ArrayList<>();
        for (Character ch : sentence.toCharArray()) {
            if (alphabet.stream().noneMatch(c -> c == ch) && Character.isAlphabetic(ch)) {
                alphabet.add(ch);
            }
        }
        return alphabet.size() == 26;
    }
}
