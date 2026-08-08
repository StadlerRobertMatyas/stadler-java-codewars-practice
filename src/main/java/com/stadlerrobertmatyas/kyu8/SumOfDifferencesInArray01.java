package com.stadlerrobertmatyas.kyu8;

import java.util.Arrays;
import java.util.Collections;

public class SumOfDifferencesInArray01 {

    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        Integer[] descArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            descArr[i] = arr[i];
        }
        Arrays.sort(descArr, Collections.reverseOrder());
        for (int i = 0; i < descArr.length - 1; i++) {
            sum += descArr[i] - descArr[i + 1];
        }
        return sum;
    }
}
