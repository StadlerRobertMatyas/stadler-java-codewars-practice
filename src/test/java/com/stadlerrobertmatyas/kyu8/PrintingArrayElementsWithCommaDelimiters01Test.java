package com.stadlerrobertmatyas.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrintingArrayElementsWithCommaDelimiters01Test {
    @Test
    @DisplayName("Example test")
    void testInteger() {
        Integer[] array = new Integer[] { 2, 4, 5, 2 };
        assertEquals("2,4,5,2", PrintingArrayElementsWithCommaDelimiters01.printArray(array), "Testing with: [2, 4, 5, 2]");
    }
}
