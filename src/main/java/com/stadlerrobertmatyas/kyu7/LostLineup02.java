package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/6914c975e159c8f7e120cc84
public class LostLineup02 {

    public static int[] findLineup(final int[] distances) {
        if (distances == null || distances.length < 1) {
            return new int[0];
        }

        int[] result = new int[distances.length];
        int number = 1;

        for (int distance : distances) {
            if (distance >= distances.length || result[distance] != 0) {
                return new int[0];
            }
            result[distance] = number;
            number++;
        }

        return result;
    }
}
