package com.stadlerrobertmatyas.kyu6;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MultiplesOfThreeOrFiveTest {

    private final MultiplesOfThreeOrFive solution = new MultiplesOfThreeOrFive();

    @Test @Order(1)
    public void test10() {
        assertEquals(23, solution.solution(10));
    }

    @Test @Order(2)
    public void test20() {
        assertEquals(78, solution.solution(20));
    }

    @Test @Order(3)
    public void test200() {
        assertEquals(9168, solution.solution(200));
    }

    @Test @Order(4)
    public void test0() {
        assertEquals(0, solution.solution(0));
    }
}

