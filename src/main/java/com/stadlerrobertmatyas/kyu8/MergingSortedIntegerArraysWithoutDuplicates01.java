package com.stadlerrobertmatyas.kyu8;

import java.util.*;

// https://www.codewars.com/kata/573f5c61e7752709df0005d2
public class MergingSortedIntegerArraysWithoutDuplicates01 {

    public static int[] mergeArrays(int[] first, int[] second) {
        int counter = 0;
        int index = 0;
        Set<Integer> uniqueNumbers = new TreeSet<>();

        for (int number : first) {
            uniqueNumbers.add(number);
        }

        for (int number : second) {
            uniqueNumbers.add(number);
        }

        int[] mergedUniqueNumbers = new int[uniqueNumbers.size()];

        for (Integer uniqueNumber : uniqueNumbers) {
            mergedUniqueNumbers[index] = uniqueNumber;
            index++;
        }

        return mergedUniqueNumbers;
    }
}
