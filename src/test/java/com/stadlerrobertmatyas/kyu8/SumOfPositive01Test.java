package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfPositive01Test {
    @Test
    public void testSomething() {
        assertEquals(15, SumOfPositive01.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, SumOfPositive01.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, SumOfPositive01.sum(new int[]{}));
        assertEquals(0, SumOfPositive01.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, SumOfPositive01.sum(new int[]{-1,2,3,4,-5}));
    }
}
