package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/55d277882e139d0b6000005d
public class GrasshopperArrayMean {

    public static int findAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
}
