package com.stadlerrobertmatyas.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/573f5c61e7752709df0005d2
public class MergingSortedIntegerArraysWithoutDuplicates02 {

    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
    }
}
