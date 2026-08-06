package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class FindMaximumAndMinimumValuesOfAListTest {

    private FindMaximumAndMinimumValuesOfAList findMaximumAndMinimumValuesOfAList = new FindMaximumAndMinimumValuesOfAList();

    @Test
    public void testExamples() {
        assertEquals(-110, findMaximumAndMinimumValuesOfAList.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, findMaximumAndMinimumValuesOfAList.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, findMaximumAndMinimumValuesOfAList.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, findMaximumAndMinimumValuesOfAList.max(new int[]{5}));
    }
}
