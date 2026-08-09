package com.stadlerrobertmatyas.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/5a2be17aee1aaefe2a000151
public class ArrayPlusArray02 {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
