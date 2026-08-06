package com.stadlerrobertmatyas.kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StopSpinningMyWordsTest {

    @Test
    public void test() {
        assertEquals("emocleW", new StopSpinningMyWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopSpinningMyWords().spinWords("Hey fellow warriors"));
    }
}
