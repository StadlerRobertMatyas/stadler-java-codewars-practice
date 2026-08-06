package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/515e271a311df0350d00000f
public class SquareNSum02 {

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int number : n) {
            sum += number * number;
        }
        return sum;
    }
}
