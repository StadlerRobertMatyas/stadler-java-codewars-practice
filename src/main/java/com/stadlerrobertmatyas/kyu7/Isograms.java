package com.stadlerrobertmatyas.kyu7;

import java.util.HashSet;
import java.util.Set;

// https://www.codewars.com/kata/54ba84be607a92aa900000f1
public class Isograms {

    public static boolean  isIsogram(String str) {
        if (str != null) {
            Set<String> lowerCaseLetters = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                String substring = str.toLowerCase().substring(i, i + 1);
                if (!lowerCaseLetters.add(substring)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
