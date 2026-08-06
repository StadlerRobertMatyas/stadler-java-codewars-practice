package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/52fba66badcd10859f00097e
public class DisemvowelTrolls01 {

    public static String disemvowel(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder filtered = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                case 'A':
                    break;
                case 'E':
                    break;
                case 'I':
                    break;
                case 'O':
                    break;
                case 'U':
                    break;
                default:
                    filtered.append(c);
            }
        }
        return filtered.toString();
    }
}
