package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5583090cbe83f4fd8c000051
public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {
        // Code here
        String numStr = String.valueOf(n);
        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = Character.getNumericValue(numStr.charAt(numStr.length() - 1 - i));
        }
        return result;
    }
}
