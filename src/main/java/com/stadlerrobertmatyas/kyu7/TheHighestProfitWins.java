package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/559590633066759614000063
public class TheHighestProfitWins {

    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int min = arr[0];
        int max = arr[0];
        int[] minMaxNumbers = new int[2];
        if (arr.length == 1) {
            for (int number : minMaxNumbers) {
                number = arr[0];
            }
        }
        if (arr.length >= 1) {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            minMaxNumbers[0] = min;
            minMaxNumbers[1] = max;
        }
        return minMaxNumbers;
    }
}
