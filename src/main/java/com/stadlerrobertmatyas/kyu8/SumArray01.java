package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/53dc54212259ed3d4f00071c
public class SumArray01 {

    public static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
