package com.stadlerrobertmatyas.kyu7;

import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(item -> item instanceof Integer)
                .collect(Collectors.toList());
    }
}
