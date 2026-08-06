package com.stadlerrobertmatyas.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {1,3,2,5,3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
        assertArrayEquals(new int[] {0}, ConvertNumberToReversedArrayOfDigits.digitize(0));
        assertArrayEquals(new int[] {7,5,3,2,8,5,3,2}, ConvertNumberToReversedArrayOfDigits.digitize(23582357));
        assertArrayEquals(new int[] {8,3,7,4,6,7,4,8,9}, ConvertNumberToReversedArrayOfDigits.digitize(984764738));
        assertArrayEquals(new int[] {0,2,9,3,9,8,2,6,7,5,4}, ConvertNumberToReversedArrayOfDigits.digitize(45762893920L));
        assertArrayEquals(new int[] {4,9,3,8,3,8,2,0,7,8,4,5}, ConvertNumberToReversedArrayOfDigits.digitize(548702838394L));
    }
}
