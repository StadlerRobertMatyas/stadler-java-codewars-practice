package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/59ca8246d751df55cc00014c
public class IsHeGonnaSurvive {

    public static boolean hero(int bullets, int dragons) {
        if ((double) bullets >= (double) dragons * 2) {
            return true;
        } else {
            return false;
        }
    }
}
