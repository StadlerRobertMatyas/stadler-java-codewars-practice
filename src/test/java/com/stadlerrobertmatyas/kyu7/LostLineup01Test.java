package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LostLineup01Test {

    @Test
    void validCases() {
        assertArrayEquals(new int[]{3, 1, 2}, LostLineup01.findLineup(new int[]{1, 2, 0}));
        assertArrayEquals(new int[]{6, 1, 3, 9, 2, 7, 4, 8, 5}, LostLineup01.findLineup(new int[]{1, 4, 2, 6, 8, 0, 5, 7, 3}));
        assertArrayEquals(new int[]{1}, LostLineup01.findLineup(new int[]{0}));
    }

    @Test
    void invalidCases() {
        assertArrayEquals(new int[]{}, LostLineup01.findLineup(new int[]{1}));
        assertArrayEquals(new int[]{}, LostLineup01.findLineup(new int[]{1, 0, 1}));
        assertArrayEquals(new int[]{}, LostLineup01.findLineup(new int[]{1, 2, 0, 4}));
    }
}

