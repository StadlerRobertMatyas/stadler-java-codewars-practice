package com.stadlerrobertmatyas.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareEveryDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
        assertEquals(0, new SquareEveryDigit().squareDigits(0));
    }

}
