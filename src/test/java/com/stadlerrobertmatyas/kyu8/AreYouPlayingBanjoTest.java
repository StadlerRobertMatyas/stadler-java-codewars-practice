package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AreYouPlayingBanjoTest {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Rikke"));
        assertEquals( "Nope! Remember lower case counts, too!", "rolf plays banjo", AreYouPlayingBanjo.areYouPlayingBanjo("rolf"));
        assertEquals( "Nope!", "bravo does not play banjo", AreYouPlayingBanjo.areYouPlayingBanjo("bravo"));
    }
}
