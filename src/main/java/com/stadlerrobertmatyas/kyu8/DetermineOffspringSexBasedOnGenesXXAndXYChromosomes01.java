package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/56530b444e831334c0000020
public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes01 {

    public static String chromosomeCheck(String sperm) {
        if (sperm.equals("XY")) {
            return "Congratulations! You're going to have a son.";
        } else if (sperm.equals("XX")) {
            return "Congratulations! You're going to have a daughter.";
        } else {
            return "Invalid sperm";
        }
    }
}
