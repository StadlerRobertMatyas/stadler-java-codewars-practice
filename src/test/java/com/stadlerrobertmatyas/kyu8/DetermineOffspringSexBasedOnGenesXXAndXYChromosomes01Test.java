package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes01Test {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.",
                DetermineOffspringSexBasedOnGenesXXAndXYChromosomes01.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.",
                DetermineOffspringSexBasedOnGenesXXAndXYChromosomes01.chromosomeCheck("XX"));
    }
}
