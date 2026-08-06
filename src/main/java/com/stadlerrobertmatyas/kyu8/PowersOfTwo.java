package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/57a083a57cb1f31db7000028
public class PowersOfTwo {

    public static long[] powersOfTwo(int n){

        long[] exponents = new long [n + 1];
        for (int i = 0; i < exponents.length; i++) {
            exponents[i] = (long) Math.pow(2, i);
        }
        return exponents;
    }
}
