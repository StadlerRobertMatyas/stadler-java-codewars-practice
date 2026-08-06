package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
public class ParseNiceIntFromCharProblem {

    public static int howOld(final String herOld) {

        char firstChar = herOld.charAt(0);
        switch (firstChar) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return -1;
        }
    }
}
