package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/546e2562b03326a88e000020
public class SquareEveryDigit {

    public int squareDigits(int n) {
        if (n >= 0) {
            int digit;
            String number = String.valueOf(n);
            StringBuilder squareDigit = new StringBuilder();
            for (int i = 0; i < number.length(); i++) {
                digit = Integer.parseInt(String.valueOf(number.charAt(i)));
                digit *= digit;
                squareDigit.append(digit);
            }
            String result = squareDigit.toString();
            return Integer.parseInt(result);
        }
        return 0;
    }
}
