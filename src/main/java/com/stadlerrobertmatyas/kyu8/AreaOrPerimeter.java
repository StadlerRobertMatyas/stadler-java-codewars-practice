package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5ab6538b379d20ad880000ab
public class AreaOrPerimeter {

    public static int areaOrPerimeter (int l, int w) {
        int area = l * w;
        int perimeter = (l + w) * 2;
        if (l != w) {
            return perimeter;
        } else {
            return area;
        }
    }
}
