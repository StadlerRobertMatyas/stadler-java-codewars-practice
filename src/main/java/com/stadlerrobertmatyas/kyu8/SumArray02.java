package com.stadlerrobertmatyas.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/53dc54212259ed3d4f00071c
public class SumArray02 {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
