package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/56747fd5cb988479af000028
public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {
        if (word != null && !word.isEmpty()) {
            if (word.length() > 1 && word.length() % 2 == 0) {
                return word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
            } else {
                return word.substring(word.length() / 2, (word.length() / 2) + 1);
            }
        }
        return null;
    }
}
