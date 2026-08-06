package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5a34b80155519e1a00000009
public class MultipleOfIndex {

    private MultipleOfIndex() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int[] multipleOfIndex(int[] array) {

        if (array == null || array.length < 2) {
            return new int[0];
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isMultipleOfIndex(array[i], i)) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (isMultipleOfIndex(array[i], i)) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }

    private static boolean isMultipleOfIndex(int value, int index) {
        return index == 0 ? value == 0 : value % index == 0;
    }
}
