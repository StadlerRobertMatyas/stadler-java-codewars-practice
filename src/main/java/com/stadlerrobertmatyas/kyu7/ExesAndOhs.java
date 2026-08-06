package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/55908aad6620c066bc00002a
public class ExesAndOhs {

    public static boolean getXO (String str) {
        int oCounter = 0;
        int xCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == 'x' || character == 'X') {
                xCounter++;
            } else if (character == 'o' || character == 'O') {
                oCounter++;
            }
        }
        return xCounter == oCounter;
    }
}
