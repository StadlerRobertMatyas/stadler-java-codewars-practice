package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/57ee24e17b45eff6d6000164
public class CatAndMouseEasyVersion {

    public static String catMouse(String x){
        if (x.startsWith("C") && x.endsWith("m")) {
            int gapLength = 0;
            String gap;
            gap = x.substring(1, x.length() - 1);
            for (int i = 0; i < gap.length(); i++) {
                if (String.valueOf(gap.charAt(i)).equals(".")) {
                    gapLength++;
                } else {
                    return "Invalid cat chasing mouse string";
                }
            }
            if (gapLength >= 0 && gapLength <= 3) {
                return "Caught!";
            } else {
                return "Escaped!";
            }
        } else {
            return "Invalid cat chasing mouse string";
        }
    }
}
