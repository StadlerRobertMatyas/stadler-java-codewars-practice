package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/577a98a6ae28071780000989
public class FindMaximumAndMinimumValuesOfAList {

    public int min(int[] list) {
        int min = list[0];
        for(int i = 0; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for(int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }
}
