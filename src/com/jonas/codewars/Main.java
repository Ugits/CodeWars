package com.jonas.codewars;

import java.util.Arrays;
import java.util.HexFormat;

public class Main {
    public static void main(String[] args) {


        /*Todo
            * h is a health number assigned to each person (8 digit date of birth YYYYMMDD)
            * CAFE is a cup of regular coffee
            * DECAF is a cup of decaffeinated coffee
 * */
        //CAFE	51966
        //DECAF	912559
        //DEAD	57005
        System.out.println(Integer.toHexString(57005));
        System.out.println(Arrays.toString(Dinglemouse.coffeeLimits(1964, 11, 28)));




        // TODO: 2023-10-16
        //System.out.println(PangramChecker.check("The quick brown fox jumps over the lazy dog."));

        // TODO: 2023-10-16
        //System.out.println(Maskify.maskify("Kanelbulle123"));

        // TODO: 2023-10-16
        //System.out.println(ToCamelCase.toCamelCase("snipp-smör"));
    }
}
