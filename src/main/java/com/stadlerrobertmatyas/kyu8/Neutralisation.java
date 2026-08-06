package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/65128732b5aff40032a3d8f0
public class Neutralisation {

    public static String neutralise(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            Character character1 = s1.charAt(i);
            Character character2 = s2.charAt(i);
            if (character1.equals('+') && character2.equals('+')) {
                result.append('+');
            } else if (character1.equals('-') && character2.equals('-')) {
                result.append("-");
            } else if (character1.equals('+') && character2.equals('-') || character1.equals('-') && character2.equals('+')) {
                result.append("0");
            }
        }
        return result.toString();
    }
}
