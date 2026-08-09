package com.stadlerrobertmatyas.kyu8;

import java.util.List;

public class SumMixedArray02 {

    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
