package com.stadlerrobertmatyas.kyu8;

import java.util.Arrays;

public class SumOfDifferencesInArray02 {

    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length - 1] - arr[0];
    }
}
