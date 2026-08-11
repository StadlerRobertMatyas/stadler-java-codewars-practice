package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/66c0fec80a2a28b2a451d408
public class TreasureHuntWithClues01 {

    public static int findTreasure(int[][] grid, int row, int col) {
        int currentRowIndex = row - 1;
        int currentColumnIndex = col - 1;

        while (true) {
            int value = grid[currentRowIndex][currentColumnIndex];
            int nextRowIndex = value / 10 - 1;
            int nextColumnIndex = value % 10 - 1;

            if (nextRowIndex == currentRowIndex && nextColumnIndex == currentColumnIndex) {
                return value;
            }

            currentRowIndex = nextRowIndex;
            currentColumnIndex = nextColumnIndex;
        }
    }
}
