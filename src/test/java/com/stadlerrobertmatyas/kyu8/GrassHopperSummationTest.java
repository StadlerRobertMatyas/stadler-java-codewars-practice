package com.stadlerrobertmatyas.kyu8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GrassHopperSummationTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopperSummation.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrassHopperSummation.summation(8));
    }
}
