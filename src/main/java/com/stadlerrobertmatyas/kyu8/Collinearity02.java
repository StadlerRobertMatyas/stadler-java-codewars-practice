package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/65ba420888906c1f86e1e680
public class Collinearity02 {

    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        if (x1 * y2 == x2 * y1) {
            return true;
        } else {
            return false;
        }
    }
}
