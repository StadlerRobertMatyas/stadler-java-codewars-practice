package com.stadlerrobertmatyas.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/56e2f59fb2ed128081001328
public class PrintingArrayElementsWithCommaDelimiters02 {

    public static String printArray(Object[] array) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
