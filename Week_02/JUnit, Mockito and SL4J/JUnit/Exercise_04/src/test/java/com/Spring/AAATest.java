package com.Spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAATest {

    private int a;
    private int b;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        a = 10;
        b = 20;
    }

    @Test
    public void testAddition() {

        int expected = 30;

        int result = a + b;

        assertEquals(expected, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
    }
}