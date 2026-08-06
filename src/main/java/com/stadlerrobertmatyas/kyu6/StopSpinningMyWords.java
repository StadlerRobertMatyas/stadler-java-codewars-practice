package com.stadlerrobertmatyas.kyu6;

// https://www.codewars.com/kata/5264d2b162488dc400000001
public class StopSpinningMyWords {

    public String spinWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }

            String word = words[i];
            if (word.length() >= 5) {
                StringBuilder reverseWord = new StringBuilder();
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord.append(word.charAt(j));
                }
                result.append(reverseWord);
            } else {
                result.append(word);
            }
        }
        return result.toString();
    }
}
