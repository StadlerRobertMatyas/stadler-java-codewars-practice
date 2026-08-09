package com.stadlerrobertmatyas.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/5f70c883e10f9e0001c89673
public class GravityFlip01 {

    public static int[] flip(char dir, int[] arr) {
        if (dir == 'R') {
            Arrays.sort(arr);
        } else if (dir == 'L') {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }
        return arr;
    }
}
