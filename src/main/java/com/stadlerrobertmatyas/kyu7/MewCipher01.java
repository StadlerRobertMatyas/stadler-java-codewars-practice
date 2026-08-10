package com.stadlerrobertmatyas.kyu7;

public class MewCipher01 {

    public static String decipher(String[] code) {
        if (code == null || code.length < 1) {
            return null;
        }

        StringBuilder result = new StringBuilder(code[0].length());

        for (int i = 0; i < code[0].length(); i++) {
            int sum = 0;

            for (String word : code) {
                char character = word.charAt(i);
                if (character == ' ') {
                    sum += 0;
                } else {
                    sum += character - 'a' + 1;
                }
            }

            int average = sum / code.length;

            if (average == 0) {
                result.append(' ');
            } else {
                result.append((char) (average + 'a' - 1));
            }
        }

        return result.toString();
    }
}
