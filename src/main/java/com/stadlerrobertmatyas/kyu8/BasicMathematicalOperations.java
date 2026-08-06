package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/57356c55867b9b7a60000bd7
public class BasicMathematicalOperations {

    public static Integer basicMath(String op, int v1, int v2) {
        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else if (op.equals("/")) {
            return v1 / v2;
        } else {
            return null;
        }
    }
}
