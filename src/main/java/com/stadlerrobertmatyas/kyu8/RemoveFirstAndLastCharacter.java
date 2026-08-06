package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
public class RemoveFirstAndLastCharacter {

    public static String remove(String str) {
        if (str != null || str.length() >= 2) {
            str = str.substring(1, str.length() - 1);
            return str;
        }
        return null;
    }
}
