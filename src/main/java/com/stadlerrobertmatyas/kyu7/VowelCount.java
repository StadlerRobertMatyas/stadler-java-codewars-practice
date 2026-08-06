package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/54ff3102c1bad923760001f3
public class VowelCount {

    public static int getCount(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char character = str.toLowerCase().charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                counter++;
            }
        }
        return counter;
    }
}
