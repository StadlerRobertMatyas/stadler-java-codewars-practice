package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DisemvowelTrolls01Test {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",DisemvowelTrolls01.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", DisemvowelTrolls01.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", DisemvowelTrolls01.disemvowel("What are you, a communist?"));
    }
}
