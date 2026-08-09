package com.stadlerrobertmatyas.kyu8;

public class CSVRepresentationOfArray01 {

    public static String toCsvText(int[][] array){
        StringBuilder matrix = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array[i].length - 1) {
                    matrix.append(array[i][j] + ",");
                } else {
                    if (j == array[i].length - 1 && i == array.length - 1) {
                        matrix.append(array[i][j]);
                    } else {
                        matrix.append(array[i][j] + "\n");
                    }
                }
            }
        }
        return matrix.toString();
    }
}
