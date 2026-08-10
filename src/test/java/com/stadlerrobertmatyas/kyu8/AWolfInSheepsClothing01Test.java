package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AWolfInSheepsClothing01Test {
    @Test
    public void testSomething() {
        assertEquals("Pls go away and stop eating my sheep", AWolfInSheepsClothing01.warnTheSheep(new String[]{"wolf"}));
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", AWolfInSheepsClothing01.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", AWolfInSheepsClothing01.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", AWolfInSheepsClothing01.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", AWolfInSheepsClothing01.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", AWolfInSheepsClothing01.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}
