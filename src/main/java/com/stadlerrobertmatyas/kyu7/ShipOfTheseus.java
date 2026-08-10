package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/69b83710b26939b35fd10429
public class ShipOfTheseus {

    public static boolean shipOfTheseus(String[][] ship) {
        if (ship == null || ship.length <= 1) {
            return true;
        }
        for (String[] row : ship) {
            if (row.length != ship[0].length) {
                return false;
            }
        }
        for (int i = 0; i < ship.length - 1; i++) {
            int differenceCounter = 0;
            for (int j = 0; j < ship[0].length; j++) {
                if (!ship[i][j].equals(ship[i + 1][j])) {
                    differenceCounter++;
                    if (differenceCounter == 0 || differenceCounter >= 2) {
                        return false;
                    }
                }
            }
            if (differenceCounter != 1) {
                return false;
            }
        }
        return true;
    }
}
