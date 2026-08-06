package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatAndMouseEasyVersionTest {

    private static void doTest(String s, String expected) {
        assertEquals(expected, CatAndMouseEasyVersion.catMouse(s),
                "catMouse(\"" + s + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("C....m", "Escaped!");
        doTest("C..m", "Caught!");
        doTest("C.....m", "Escaped!");
        doTest("C.m", "Caught!");
        doTest("C...m", "Caught!");
        doTest("Cm", "Caught!");
    }
}

