package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/54edbc7200b811e956000556
public class CountingSheep {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) {
                continue;
            } else if (arrayOfSheeps[i] == true) {
                counter++;
            }
        }
        return counter;
    }
}
