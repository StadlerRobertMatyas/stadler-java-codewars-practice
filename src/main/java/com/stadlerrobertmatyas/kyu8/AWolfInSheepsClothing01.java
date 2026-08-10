package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15
public class AWolfInSheepsClothing01 {

    public static String warnTheSheep(String[] array) {
        int sheepWarningIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                if (array[array.length - 1].equals("wolf")) {
                    return "Pls go away and stop eating my sheep";
                } else {
                    sheepWarningIndex = array.length - i - 1;
                    return String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", sheepWarningIndex);
                }
            }
        }
        return null;
    }
}
