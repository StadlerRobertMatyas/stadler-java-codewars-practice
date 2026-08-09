package com.stadlerrobertmatyas.kyu8;

import java.util.List;

// https://www.codewars.com/kata/57eaeb9578748ff92a
public class SumMixedArray01 {

    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object number : mixed) {
            if (number instanceof String) {
                sum += Integer.parseInt((String) number);
            } else if (number instanceof Integer) {
                sum += (Integer) number;
            }
        }
        return sum;
    }
}
