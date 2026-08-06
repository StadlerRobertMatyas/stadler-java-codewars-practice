package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/55d24f55d7dd296eb9000030
public class GrassHopperSummation {

    public static int summation(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
