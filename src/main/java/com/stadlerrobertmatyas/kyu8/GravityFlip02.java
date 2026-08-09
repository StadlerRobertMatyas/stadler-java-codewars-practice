package com.stadlerrobertmatyas.kyu8;

import java.util.Arrays;
import java.util.Collections;

// https://www.codewars.com/kata/5f70c883e10f9e0001c89673
public class GravityFlip02 {

    public static int[] flip(char dir, int[] arr) {
        if (dir == 'L') {
            arr = Arrays.stream(arr)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            Arrays.sort(arr);
        }
        return arr;
    }
}
