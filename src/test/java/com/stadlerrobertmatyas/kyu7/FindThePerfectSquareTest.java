package com.stadlerrobertmatyas.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindThePerfectSquareTest {
    @Test
    public void test1() {
        assertEquals(144, FindThePerfectSquare.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, FindThePerfectSquare.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, FindThePerfectSquare.findNextSquare(114));
    }
}
