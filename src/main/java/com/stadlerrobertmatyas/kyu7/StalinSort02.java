package com.stadlerrobertmatyas.kyu7;

import java.util.Iterator;
import java.util.List;

// https://www.codewars.com/kata/699af631058f5c12b04f4efe
public class StalinSort02 {

    public static void stalinSort(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return;
        }

        Iterator<Integer> iterator = arr.iterator();
        int currentElement = iterator.next();

        while (iterator.hasNext()) {
            int nextElement = iterator.next();
            if (nextElement < currentElement) {
                System.out.println("Расстрелять!");
                iterator.remove();
            } else {
                currentElement = nextElement;
            }
        }
    }
}
