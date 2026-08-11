package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrisonBreak02Test {

    @Test
    @DisplayName("Fixed basic tests")
    void testBasicCases() {
        assertEquals(4, PrisonBreak02.freedPrisoners(new Boolean[] { true, true, false, false, false, true, false }));
        assertEquals(2, PrisonBreak02.freedPrisoners(new Boolean[] { true, false, false, false, false, false, false }));
        assertEquals(2, PrisonBreak02.freedPrisoners(new Boolean[] { true, true, true, false, false, false }));
        assertEquals(6, PrisonBreak02.freedPrisoners(new Boolean[] { true, false, true, false, true, false }));
        assertEquals(1, PrisonBreak02.freedPrisoners(new Boolean[] { true, true, true }), "once the first prisoner is freed, all cells become locked");
        assertEquals(0, PrisonBreak02.freedPrisoners(new Boolean[] { false, false, false }), "the first cell is locked, so no switches are possible");
        assertEquals(0, PrisonBreak02.freedPrisoners(new Boolean[] { false, true, true, true }), "the first cell is locked, so no switches are possible");
    }
}

