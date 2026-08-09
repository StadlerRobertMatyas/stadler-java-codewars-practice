package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/55a2d7ebe362935a210000b2
public class FindTheSmallestIntegerInTheArray01 {

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int number : args) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
}
