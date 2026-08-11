package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreasureHuntWithClues02Test {
    @Test
    public void simpleTests() {
        // Example from the description
        final int[][] grid1 = {{34, 21, 32, 44, 25},{21, 41, 43, 14, 31},{31, 45, 52, 42, 23},{33, 15, 51, 44, 35},{21, 52, 33, 13, 44}};
        assertEquals(31, TreasureHuntWithClues02.findTreasure(grid1, 3, 4));

        // A different starting position leads to a different treasure.
        assertEquals(21, TreasureHuntWithClues02.findTreasure(grid1, 1, 2));

        // Example of a 9x9 grid
        int[][] grid2 = { {34, 21, 98, 14, 25, 29, 32, 18, 25}, {21, 12, 43, 34, 31, 12, 43, 34, 93}, {67, 45, 52, 42, 23, 45, 52, 42, 23},
                {38, 76, 51, 53, 35, 15, 51, 53, 35}, {21, 15, 51, 53, 98, 15, 51, 53, 35}, {34, 18, 62, 41, 25, 24, 37, 41, 25},
                {71, 12, 43, 34, 31, 29, 43, 34, 31}, {55, 45, 83, 42, 73, 45, 52, 42, 23}, {33, 15, 55, 53, 36, 15, 51, 98, 35}};
        assertEquals(98, TreasureHuntWithClues02.findTreasure(grid2, 1, 1));
    }

    @Test
    public void specialCases() {
        // n=1
        assertEquals(11, TreasureHuntWithClues02.findTreasure(new int[][]{{11}}, 1, 1));

        // All values the same
        assertEquals(21, TreasureHuntWithClues02.findTreasure(
                new int[][]{ {21, 21, 21}, {21, 21, 21}, {21, 21, 21} }, 2, 3));

        // Navigating the whole grid from top-left to bottom-right
        int[][] grid3 = { {12, 13, 14, 15, 21}, {22, 23, 24, 25, 31}, {32, 33, 34, 35, 41}, {42, 43, 44, 45, 51}, {52, 53, 54, 55, 55} };
        assertEquals(55, TreasureHuntWithClues02.findTreasure(grid3, 1, 1));

        // Navigating the whole grid - meandering path
        int[][] grid4 = { {34, 24, 32, 41, 25}, {14, 12, 43, 44, 31}, {54, 45, 52, 34, 23}, {33, 15, 51, 53, 35}, {21, 55, 11, 13, 22} };
        assertEquals(34, TreasureHuntWithClues02.findTreasure(grid4, 1, 5));
    }
}

