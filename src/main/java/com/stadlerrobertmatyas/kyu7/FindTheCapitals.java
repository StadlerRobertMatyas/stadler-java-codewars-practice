package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/539ee3b6757843632d00026b
public class FindTheCapitals {

    public static int[] capitals(String s){
        if (s == null || s.isEmpty()) {
            return new int[0];
        }

        int counter = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                counter++;
            }
        }

        int[] results = new int[counter];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                results[index] = i;
                index++;
            }
        }
        return results;
    }
}
