package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BeginnerSeriesFourCockroachTest{
    @Test
    public void basicTests() throws Exception{
        BeginnerSeriesFourCockroach cockroach = new BeginnerSeriesFourCockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}
