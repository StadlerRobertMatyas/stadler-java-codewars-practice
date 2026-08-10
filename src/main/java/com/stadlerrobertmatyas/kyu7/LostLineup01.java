package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/6914c975e159c8f7e120cc84
public class LostLineup01 {

    public static int[] findLineup(final int[] distances) {
        if (distances == null || distances.length < 1) {
            return new int[0];
        }

        int[] result = new int[distances.length];
        boolean[] seats = new boolean[distances.length];
        int counter = 0;

        for (int i = 0; i < distances.length; i++) {
            int index = distances[i];
            if (index < 0 || index >= distances.length ||  seats[index] == true) {
                return new int[0];
            }
            seats[index] = true;
            result[index] = i + 1;
            counter++;
        }

        if (counter == distances.length) {
            return result;
        } else {
            return new int[0];
        }
    }
}
