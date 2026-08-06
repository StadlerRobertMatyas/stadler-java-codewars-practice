package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/5412509bd436bd33920011bc
public class CreditCardMask {

    public static String maskify(String str) {
        if (str != null) {
            StringBuilder maskedStr = new StringBuilder();
            if (str.length() >= 4) {
                for (int i = 0; i < str.length(); i++) {
                    if (i > str.length() - 5) {
                        String substring = str.substring(i, i + 1);
                        maskedStr.append(substring);
                    } else {
                        maskedStr.append("#");
                    }
                }
                return maskedStr.toString();
            } else {
                return str;
            }
        } else {
            return null;
        }
    }
}
