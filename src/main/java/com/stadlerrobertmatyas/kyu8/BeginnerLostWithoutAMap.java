package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/57f781872e3d8ca2a000007e
public class BeginnerLostWithoutAMap {

    public static int[] map(int[] arr) {
        int[] doubledArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubledArray[i] = arr[i] * 2;
        }
        return doubledArray;
    }
}
