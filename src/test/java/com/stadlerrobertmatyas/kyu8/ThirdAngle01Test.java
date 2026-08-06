package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ThirdAngle01Test {
    private Object ThirdAngle;

    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngle01.otherAngle(45,12));
        assertEquals(70, ThirdAngle01.otherAngle(50,60));
    }
}
