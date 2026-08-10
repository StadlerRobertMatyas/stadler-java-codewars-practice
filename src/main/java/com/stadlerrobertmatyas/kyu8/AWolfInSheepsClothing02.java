package com.stadlerrobertmatyas.kyu8;

import java.util.Arrays;
import java.util.Collections;

// https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15
public class AWolfInSheepsClothing02 {

    public static String warnTheSheep(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0
                ? "Pls go away and stop eating my sheep"
                : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }
}
