package com.stadlerrobertmatyas.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindTheStrayNumberTest {

    @Test
    public void threeElements1() {
        assertEquals(2, getActualFor(2, 1, 1));
    }

    @Test
    public void threeElements2() {
        assertEquals(2, getActualFor(1, 2, 1));
    }

    @Test
    public void threeElements3() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return FindTheStrayNumber.stray(numbers);
    }
}
