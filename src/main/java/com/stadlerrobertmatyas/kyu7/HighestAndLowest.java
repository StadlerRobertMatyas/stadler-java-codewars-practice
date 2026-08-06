package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/554b4ac871d6813a03000035
public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        if (numbers.length() >= 1 && numbers != null) {
            String[] numbersSeparated = numbers.trim().split("\\s+");
            StringBuilder result = new StringBuilder();
            int number = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < numbersSeparated.length; i++) {
                number = Integer.parseInt(numbersSeparated[i]);
                if (min > number) {
                    min = number;
                }
                if (max < number) {
                    max = number;
                }
            }
            result.append(Integer.toString(max) + " ");
            result.append(Integer.toString(min));
            return result.toString();
        }
        return null;
    }
}
