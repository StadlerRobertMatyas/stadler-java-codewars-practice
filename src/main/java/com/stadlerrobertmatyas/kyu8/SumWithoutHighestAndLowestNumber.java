package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/576b93db1129fcf2200001e6
public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if (numbers == null || numbers.length < 2) {
            return 0;
        } else {
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                sum += number;
            }
        }
        return sum - min - max;
    }
}
