package com.stadlerrobertmatyas.kyu8;

import java.text.DecimalFormat;

public class FormattingDecimalPlaces {

    // https://www.codewars.com/kata/5641a03210e973055a00000d
    public static double TwoDecimalPlaces(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        String res = df.format(number);
        return Double.valueOf(res);
    }
}
