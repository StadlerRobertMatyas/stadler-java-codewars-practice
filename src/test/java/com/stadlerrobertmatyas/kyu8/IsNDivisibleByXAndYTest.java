package com.stadlerrobertmatyas.kyu8;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsNDivisibleByXAndYTest {

    @Test
    public void test1() {
        assertEquals("n = 12, x = 4, y = 3\n", true, IsNDivisibleByXAndY.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals("n = 3, x = 3, y = 4\n", false, IsNDivisibleByXAndY.isDivisible(3,3,4));
    }

}
