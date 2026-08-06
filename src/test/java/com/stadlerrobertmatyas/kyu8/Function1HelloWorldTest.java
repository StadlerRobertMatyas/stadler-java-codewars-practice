package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Function1HelloWorldTest {
    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", Function1HelloWorld.greet());
    }
}
