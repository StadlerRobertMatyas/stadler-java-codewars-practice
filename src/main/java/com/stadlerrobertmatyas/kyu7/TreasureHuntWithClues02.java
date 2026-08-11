package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/66c0fec80a2a28b2a451d408
public class TreasureHuntWithClues02 {

    public static int findTreasure(int[][] grid, int row, int col) {
        int cell;
        while ((cell = grid[row - 1][col - 1]) != 10 * row + col) {
            row = cell / 10;
            col = cell % 10;
        }
        return cell;
    }
}
