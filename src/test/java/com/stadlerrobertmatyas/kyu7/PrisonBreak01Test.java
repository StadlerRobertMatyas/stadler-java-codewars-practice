package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

class PrisonBreak01Test {
    @Test
    @DisplayName("Fixed basic tests")
    void testBasicCases() {
        assertEquals(4, PrisonBreak01.freedPrisoners(new Boolean[] { true, true, false, false, false, true, false }));
        assertEquals(2, PrisonBreak01.freedPrisoners(new Boolean[] { true, false, false, false, false, false, false }));
        assertEquals(2, PrisonBreak01.freedPrisoners(new Boolean[] { true, true, true, false, false, false }));
        assertEquals(6, PrisonBreak01.freedPrisoners(new Boolean[] { true, false, true, false, true, false }));
        assertEquals(1, PrisonBreak01.freedPrisoners(new Boolean[] { true, true, true }), "once the first prisoner is freed, all cells become locked");
        assertEquals(0, PrisonBreak01.freedPrisoners(new Boolean[] { false, false, false }), "the first cell is locked, so no switches are possible");
        assertEquals(0, PrisonBreak01.freedPrisoners(new Boolean[] { false, true, true, true }), "the first cell is locked, so no switches are possible");
    }
}

