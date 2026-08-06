package com.stadlerrobertmatyas.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FunctionOneHelloWorldTest {
    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", FunctionOneHelloWorld.greet());
    }
}
