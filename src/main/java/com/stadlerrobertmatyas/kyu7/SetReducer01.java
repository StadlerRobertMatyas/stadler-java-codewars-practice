package com.stadlerrobertmatyas.kyu7;

import java.util.Arrays;

public class SetReducer01 {

    public static int setReducer(int[] input) {
        while (input.length > 1) {
            int inputIndex = 0;
            int nextIndex = 0;
            int[] next = new int[input.length];

            while (inputIndex < input.length) {
                int currentNumber = input[inputIndex];
                int counter = 0;

                while (inputIndex < input.length && input[inputIndex] == currentNumber) {
                    counter++;
                    inputIndex++;
                }

                next[nextIndex] = counter;
                nextIndex++;
            }
            input = Arrays.copyOf(next, nextIndex);
        }
        return input[0];
    }
}
