package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/555eded1ad94b00403000071
public class SumOfTheFirstNthTermOfSeries {

    public static String seriesSum(int n) {
        double sum = 0;
        double value = 1;
        for (int i = 0; i < n; i++) {
            sum += (1 / value);
            value += 3;
        }
        return String.format("%.2f", sum);
    }
}
