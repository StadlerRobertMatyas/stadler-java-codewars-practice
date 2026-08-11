package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/6507e3170b7009117e0c7865
public class PrisonBreak02 {

    public static int freedPrisoners(Boolean[] prison) {
        if (prison[0] == false) {
            return 0;
        }

        boolean isFlipped = false;
        int counter = 0;

        for (boolean prisoner : prison) {
            if (prisoner ^ isFlipped) {
                counter++;
                isFlipped = !isFlipped;
            }
        }

        return counter;
    }
}
