package com.jonas.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        List<Integer> numList = new ArrayList<>();
        for (char c : Integer.toString(num).toCharArray()) numList.add(Character.getNumericValue(c));
        numList.sort(Collections.reverseOrder());

        String sortedString = "";
        for (Integer digit : numList) sortedString += digit;
        return Integer.parseInt(sortedString);
    }
}
