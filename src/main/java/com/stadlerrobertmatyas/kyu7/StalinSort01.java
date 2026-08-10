package com.stadlerrobertmatyas.kyu7;

import java.util.List;

// https://www.codewars.com/kata/699af631058f5c12b04f4efe
public class StalinSort01 {

    public static void stalinSort(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return;
        }

        int lastSurvivingIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(lastSurvivingIndex)) {
                System.out.println("Расстрелять!");
                arr.remove(i);
                i--;
            } else {
                lastSurvivingIndex = i;
            }
        }
    }
}
