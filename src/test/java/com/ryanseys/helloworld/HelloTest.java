package com.ryanseys.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void testGreeting() {
        assertEquals("Hello World!", new Hello().getGreeting());
    }
}
