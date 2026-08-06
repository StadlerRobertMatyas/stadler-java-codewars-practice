package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5715eaedb436cf5606000381
public class SumOfPositive01 {

    public static int sum(int[] arr){
        boolean isPositive = true;
        int sum = 0;
        if (arr == null || !isPositive) {
            return sum;
        } else {
            for (int number : arr) {
                if (number > 0) {
                    isPositive = true;
                    sum += number;
                } else {
                    isPositive = false;
                }
            }
            return sum;
        }
    }
}
