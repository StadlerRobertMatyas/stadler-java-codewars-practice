package com.stadlerrobertmatyas.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintingArrayElementsWithCommaDelimiters02Test {
    @Test
    @DisplayName("Example test")
    void testInteger() {
        Integer[] array = new Integer[] { 2, 4, 5, 2 };
        assertEquals("2,4,5,2", PrintingArrayElementsWithCommaDelimiters02.printArray(array), "Testing with: [2, 4, 5, 2]");
    }
}
