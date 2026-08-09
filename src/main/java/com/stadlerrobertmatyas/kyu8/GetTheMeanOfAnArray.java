package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/563e320cee5dddcf77000158
public class GetTheMeanOfAnArray {

    public static int getAverage(int[] marks) {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (int) Math.floor(sum / marks.length);
    }
}
