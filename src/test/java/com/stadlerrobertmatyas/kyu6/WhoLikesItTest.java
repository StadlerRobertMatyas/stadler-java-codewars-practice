package com.stadlerrobertmatyas.kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhoLikesItTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt(new String[]{}));
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt(new String[]{"Peter"}));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt(new String[]{"Jacob", "Alex"}));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt(new String[]{"Max", "John", "Mark"}));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt(new String[]{"Alex", "Jacob", "Mark", "Max"}));
    }
}
