package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTheFirstNthTermOfSeriesTest {
    @Test
    public void sampleTests() {
        doTest( 0, "0.00");
        doTest( 5, "1.57");
        doTest( 9, "1.77");
        doTest(15, "1.94");
        doTest(39, "2.26");
        doTest(58, "2.40");
    }
    private static void doTest(int n, String expected) {
        String message = "n = " + n + "\n";
        String actual = SumOfTheFirstNthTermOfSeries.seriesSum(n);
        assertEquals(expected, actual, message);
    }
}
