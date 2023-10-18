package com.jonas.codewars;
import java.util.Arrays;
import java.util.List;

public class FindTheUniqueNumber {
    public static double findUniq(double[] arr) {

        List<Double> tempList = Arrays.stream(arr).boxed().toList();
        double oddValue = 0;

        if (Double.compare(arr[0], arr[1]) == 0) {for (Double value : tempList) if (value != arr[0]) oddValue = value;
        }else if (Double.compare(arr[1], arr[2]) == 0) oddValue = arr[0];
        else oddValue = arr[1];

        return oddValue;
    }


    // Best practice
    public static double _findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}




