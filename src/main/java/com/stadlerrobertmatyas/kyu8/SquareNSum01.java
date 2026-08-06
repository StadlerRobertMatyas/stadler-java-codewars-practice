package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/515e271a311df0350d00000f
public class SquareNSum01 {

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
            sum += n[i];
        }
        return sum;
    }
}
