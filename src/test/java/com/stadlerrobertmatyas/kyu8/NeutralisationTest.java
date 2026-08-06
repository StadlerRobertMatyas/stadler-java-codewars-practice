package com.stadlerrobertmatyas.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NeutralisationTest {
    @Test
    @DisplayName("Fixed Tests")
    void testBasic() {
        assertEquals("", Neutralisation.neutralise("", ""));
        assertEquals("+", Neutralisation.neutralise("+", "+"));
        assertEquals("-", Neutralisation.neutralise("-", "-"));
        assertEquals("0", Neutralisation.neutralise("+", "-"));
        assertEquals("0", Neutralisation.neutralise("-", "+"));
        assertEquals("000000", Neutralisation.neutralise("--++--", "++--++"));
        assertEquals("-+-+-+", Neutralisation.neutralise("-+-+-+", "-+-+-+"));
        assertEquals("-+00", Neutralisation.neutralise("-++-", "-+-+"));
        assertEquals("00++", Neutralisation.neutralise("--++", "++++"));
        assertEquals("++0--000-", Neutralisation.neutralise("+++--+---", "++----++-"));
        assertEquals("-----", Neutralisation.neutralise("-----", "-----"));
        assertEquals("0+", Neutralisation.neutralise("-+", "++"));
        assertEquals("-0", Neutralisation.neutralise("--", "-+"));
        assertEquals("000", Neutralisation.neutralise("-++", "+--"));
        assertEquals("0+0+0000+0", Neutralisation.neutralise("++-++--++-", "-+++-++-++"));
        assertEquals("00+0+000-", Neutralisation.neutralise("-++-+-++-", "+-++++---"));
        assertEquals("-00+0-+0-", Neutralisation.neutralise("---++-+--", "-+++--++-"));
        assertEquals("0-0-0-++0-", Neutralisation.neutralise("+-----+++-", "--+-+-++--"));
        assertEquals("0--00-+0", Neutralisation.neutralise("+-----+-", "---++-++"));
        assertEquals("-+--+-+-0-", Neutralisation.neutralise("-+--+-+---", "-+--+-+-+-"));
        assertEquals("00+", Neutralisation.neutralise("+-+", "-++"));
        assertEquals("-+0", Neutralisation.neutralise("-++", "-+-"));
        assertEquals("-00+", Neutralisation.neutralise("---+", "-+++"));
        assertEquals("+--", Neutralisation.neutralise("+--", "+--"));
        assertEquals("00+++-0-", Neutralisation.neutralise("--+++-+-", "+++++---"));
    }
}

