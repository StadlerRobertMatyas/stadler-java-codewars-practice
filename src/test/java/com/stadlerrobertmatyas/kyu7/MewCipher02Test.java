package com.stadlerrobertmatyas.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MewCipher02Test {
    @Test
    void exampletests(){
        assertEquals("walk your dog at nine", MewCipher02.decipher(new String[]{"u lk zxuq hfk as fouh","y l  zpuv  xe at sicd","welvayfuqbfpeaauaqcrc"}));
        assertEquals("hello world", MewCipher02.decipher(new String[]{"hello world"}));
        assertEquals("", MewCipher02.decipher(new String[]{"","","","",""}));
        assertEquals("hgmhjil", MewCipher02.decipher(new String[]{"jircniv","rune   ","farlord","  elnix"}));
        assertEquals("fdliic", MewCipher02.decipher(new String[]{" imma "," firin","m a h ","lazer "}));
        assertEquals("foreman pig", MewCipher02.decipher(new String[]{"foreman pig", "foreman pig"}));
    }
}
