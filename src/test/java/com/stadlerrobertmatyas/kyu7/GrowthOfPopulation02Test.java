package com.stadlerrobertmatyas.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class GrowthOfPopulation02Test {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(GrowthOfPopulation02.nbYear(1500, 5, 100, 5000),15);
        testing(GrowthOfPopulation02.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(GrowthOfPopulation02.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
