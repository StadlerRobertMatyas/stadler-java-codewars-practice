package com.stadlerrobertmatyas.kyu8;

import java.util.List;

// https://www.codewars.com/kata/57eaeb9578748ff92a
public class SumMixedArray02 {

    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
