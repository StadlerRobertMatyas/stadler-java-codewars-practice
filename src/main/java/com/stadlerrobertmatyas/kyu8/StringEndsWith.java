package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
public class StringEndsWith {

    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) {
            return false;
        }
        if (ending.isEmpty()) {
            return true;
        }
        String suffix = str.substring(str.length() - ending.length());
        return suffix.equals(ending);
    }
}
