package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MewCipher01Test {
    @Test
    void exampletests(){
        assertEquals("walk your dog at nine", MewCipher01.decipher(new String[]{"u lk zxuq hfk as fouh","y l  zpuv  xe at sicd","welvayfuqbfpeaauaqcrc"}));
        assertEquals("hello world", MewCipher01.decipher(new String[]{"hello world"}));
        assertEquals("", MewCipher01.decipher(new String[]{"","","","",""}));
        assertEquals("hgmhjil", MewCipher01.decipher(new String[]{"jircniv","rune   ","farlord","  elnix"}));
        assertEquals("fdliic", MewCipher01.decipher(new String[]{" imma "," firin","m a h ","lazer "}));
        assertEquals("foreman pig", MewCipher01.decipher(new String[]{"foreman pig", "foreman pig"}));
    }
}
