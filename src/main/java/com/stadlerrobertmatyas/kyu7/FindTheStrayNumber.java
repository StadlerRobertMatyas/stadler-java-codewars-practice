package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/57f609022f4d534f05000024
public class FindTheStrayNumber {

    public static int stray(int[] numbers) {
        if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
            return 0;
        }
        int commonValue;
        if (numbers[0] == numbers[1]) {
            commonValue = numbers[0];
        } else if (numbers[0] == numbers[2]) {
            commonValue = numbers[0];
        } else {
            commonValue = numbers[1];
        }
        for (int number : numbers) {
            if (number != commonValue) {
                return number;
            }
        }
        return 0;
    }
}
