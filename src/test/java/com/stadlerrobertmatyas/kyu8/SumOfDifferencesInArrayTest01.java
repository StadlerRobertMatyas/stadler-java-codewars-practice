package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfDifferencesInArrayTest01 {

    @Test
    public void basicTests() {
        assertEquals(9, SumOfDifferencesInArray01.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferencesInArray01.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferencesInArray01.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferencesInArray01.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferencesInArray01.sumOfDifferences(new int[0]));
        assertEquals(0, SumOfDifferencesInArray01.sumOfDifferences(new int[]{0}));
        assertEquals(0, SumOfDifferencesInArray01.sumOfDifferences(new int[]{-1}));
        assertEquals(0, SumOfDifferencesInArray01.sumOfDifferences(new int[]{1}));
    }
}
