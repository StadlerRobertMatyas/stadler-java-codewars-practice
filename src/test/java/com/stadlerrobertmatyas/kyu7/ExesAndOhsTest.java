package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExesAndOhsTest {
    @ParameterizedTest(name = "str = \"{1}\"") @DisplayName("Sample tests")
    @CsvSource(textBlock = "    true,  ooxx\n" +
                           "    false, xooxx\n" +
                           "    true,  ooxXm\n" +
                           "    true,  zpzpzpp\n" +
                           "    false, zzoo\n" +
                           "    true,  xxxooo\n" +
                           "    true,  xxxXooOo\n" +
                           "    false, xxx23424esdsfvxXXOOooo\n" +
                           "    false, xXxxoewrcoOoo\n" +
                           "    false, XxxxooO\n" +
                           "    true,  zssddd\n" +
                           "    false, Xxxxertr34\n" +
                           "    true,  ''\n")
    void sampleTests(boolean expected, String input) {
        Assertions.assertEquals(expected, ExesAndOhs.getXO(input));
    }
}