package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036
public class CsvRepresentationOfArray {

    public static String toCsvText(int[][] array){
        StringBuilder matrix = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array[i].length - 1) {
                    matrix.append(array[i][j]).append(",");
                } else {
                    if (j == array[i].length - 1 && i == array.length - 1) {
                        matrix.append(array[i][j]);
                    } else {
                        matrix.append(array[i][j]).append("\n");
                    }
                }
            }
        }
        return matrix.toString();
    }
}
