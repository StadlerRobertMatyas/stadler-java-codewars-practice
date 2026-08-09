package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/56e2f59fb2ed128081001328
public class PrintingArrayElementsWithCommaDelimiters01 {

    public static String printArray(Object[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                result.append(array[i].toString() + ",");
            } else {
                result.append(array[i].toString());
            }
        }
        return result.toString();
    }
}
