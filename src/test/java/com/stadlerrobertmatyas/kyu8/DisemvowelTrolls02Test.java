package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DisemvowelTrolls02Test {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",DisemvowelTrolls02.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", DisemvowelTrolls02.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", DisemvowelTrolls02.disemvowel("What are you, a communist?"));
    }
}