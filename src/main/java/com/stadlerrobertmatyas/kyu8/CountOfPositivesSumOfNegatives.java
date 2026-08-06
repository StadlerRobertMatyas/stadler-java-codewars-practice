package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/576bb71bbbcf0951d5000044
public class CountOfPositivesSumOfNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        // Check for null or empty array
        if (input == null || input.length == 0) {
            return new int[] {};
        }

        // Initialize counters
        int positiveCount = 0;
        int negativeSum = 0;

        // Iterate through the array
        for (int num : input) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
            }
        }

        // Return result array
        return new int[] {positiveCount, negativeSum};
    }
}
