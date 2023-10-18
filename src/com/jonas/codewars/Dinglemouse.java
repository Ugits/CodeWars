package com.jonas.codewars;

public class Dinglemouse {

    public static int[] coffeeLimits(final int year, final int month, final int day) {

        int yearTemp = year;
        if (Integer.toString(month).length() == 1) yearTemp = year * 10;

        int monthTemp = month;
        if (Integer.toString(day).length() == 1) monthTemp = month * 10;

        String temp = "" + yearTemp + monthTemp + day;
        int hCafe = Integer.parseInt(temp);
        int hDecaf = Integer.parseInt(temp);
        int cupsRegular = 0;
        int cupsDecaffeinated = 0;
        int cafe = 51966;
        int decaf = 912559;
        int cupCap = 5000;
        boolean deadByCafe = false;
        boolean deadByDecaf = false;
        while ((cupsRegular < cupCap && !deadByCafe) || (cupsDecaffeinated < cupCap && !deadByDecaf)) {

            if (!deadByCafe) {
                hCafe += cafe;
                cupsRegular++;
                deadByCafe = Integer.toHexString(hCafe).contains("dead");
            }
            if (!(deadByDecaf)){
                hDecaf += decaf;
                cupsDecaffeinated++;
                deadByDecaf = Integer.toHexString(hDecaf).contains("dead");
            }
        }
        if(cupsRegular == cupCap) cupsRegular = 0;
        if(cupsDecaffeinated == cupCap) cupsDecaffeinated = 0;

        return new int[]{cupsRegular, cupsDecaffeinated};
    }
}
