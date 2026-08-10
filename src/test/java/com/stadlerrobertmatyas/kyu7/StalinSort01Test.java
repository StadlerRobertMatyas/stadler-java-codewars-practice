package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import java.util.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StalinSort01Test {


    private void doTest(List<Integer>  input, List<Integer>  expected){
        input= new ArrayList<>(input);
        StalinSort01.stalinSort(input);
        assertIterableEquals(expected, input, String.format("Expected State of List to be %s,\nbut was %s", expected, input));
    }

    @Order(1)
    @DisplayName("Classic purge")
    @Test
    void classicPurgeTest() {

        doTest(
                Arrays.asList(3, 1, 4, 1, 5, 9, 2),
                Arrays.asList(3, 4, 5, 9)
        );
    }

    @Order(2)
    @DisplayName("No purge needed")
    @Test
    void noPurgeTest(){
        doTest(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3)
        );

    }

    @Order(3)
    @DisplayName("No purge needed")
    @Test
    void onlyFirstSurvivesTest(){
        doTest(
                Arrays.asList(5, 3, 1),
                Arrays.asList(5)
        );
    }

    @Order(4)
    @DisplayName("Empty List")
    @Test
    void emptyListTest(){
        doTest(
                Arrays.asList(),
                Arrays.asList()
        );
    }
}

