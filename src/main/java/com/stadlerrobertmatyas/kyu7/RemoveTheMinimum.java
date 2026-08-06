package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/563cf89eb4747c5fb100001b
public class RemoveTheMinimum {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return new int[0];
        }

        int min = numbers[0];
        int index = 0;
        int minIndex = 0;
        int[] results = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i != minIndex) {
                results[index] = numbers[i];
                index++;
            }
        }
        return results;
    }
}
