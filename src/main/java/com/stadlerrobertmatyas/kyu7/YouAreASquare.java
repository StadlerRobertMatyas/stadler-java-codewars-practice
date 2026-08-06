package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/54c27a33fb7da0db0100040e
public class YouAreASquare {

    public static boolean isSquare(int n) {
        double squareRoot = Math.sqrt(n);
        if (n >= 0 && squareRoot == (int) squareRoot) {
            return true;
        } else {
            return false;
        }
    }
}
