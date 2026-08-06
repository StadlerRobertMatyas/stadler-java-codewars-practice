package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/563b662a59afc2b5120000c6
public class GrowthOfPopulation01 {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        double currentPopulation = p0;
        double growthRate = percent / 100.0;

        if (p0 >= p) {
            return 0;
        }
        while (currentPopulation < p) {
            currentPopulation = Math.floor(currentPopulation + currentPopulation * growthRate + aug);
            years++;
        }
        return years;
    }

}
