package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/56269eb78ad2e4ced1000013
public class FindThePerfectSquare {

    public static long findNextSquare(long sq) {
        if (sq < 0) {
            return -1;
        }
        long root = Math.round(Math.sqrt(sq));
        if (root * root != sq) {
            return -1;
        }
        long nextRoot = root + 1;
        if (nextRoot > 3_037_000_499L) {
            return -1;
        }
        return nextRoot * nextRoot;
    }
}
