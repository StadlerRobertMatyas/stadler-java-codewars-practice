package com.stadlerrobertmatyas.kyu7;

import java.util.Stack;

// https://www.codewars.com/kata/63cbe409959401003e09978b
public class SetReducer02 {

    public static int setReducer(int[] input) {
        if (input.length == 1) return input[0];

        Stack<Integer> stackSum = new Stack<>();
        stackSum.push(1);
        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                stackSum.push(stackSum.pop() + 1);
            } else {
                stackSum.push(1);
            }
        }

        return setReducer(stackSum.stream().mapToInt(x -> x).toArray());
    }
}
