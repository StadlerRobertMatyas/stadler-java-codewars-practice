package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareNSum02Test  {

    @Test
    public void testBasic() {
        assertEquals(9, SquareNSum02.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareNSum02.squareSum(new int[] {1,2}));
        assertEquals(50, SquareNSum02.squareSum(new int[] {5,-3,4}));
        assertEquals(0, SquareNSum02.squareSum(new int[] {}));
    }
}
