package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

public class GravityFlip01Test {
    @Test
    public void Sample() {
        assertArrayEquals(new int[]{ 1,2,2,3 }, GravityFlip01.flip('R', new int[]{ 3,2,1,2 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, GravityFlip01.flip('L', new int[]{ 1,4,5,3,5 }));
    }
}

