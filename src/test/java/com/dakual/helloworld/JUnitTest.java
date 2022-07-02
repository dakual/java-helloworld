package com.dakual.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {
    @Test
    public void test_1() {
        System.out.println("Testing 1 ...");
        assertEquals("abc", "abc");
    }

    @Test
    public void test_2() {
        System.out.println("Testing 2 ...");
        assertEquals("abc", "abc");
    }
}
