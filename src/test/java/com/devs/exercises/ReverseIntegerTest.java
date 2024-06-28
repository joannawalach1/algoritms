package com.devs.exercises;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class ReverseIntegerTest extends TestCase {
    @Test
    public void testReverseInteger1() {
     ReverseInteger reverseInteger = new ReverseInteger();
     int x = 123;
     int expected = 321;
     int reversed = reverseInteger.reverseInteger(x);
     assertEquals(expected, reversed);

    int x1 = -123;
    int expected1 = -321;
    int reversed1 = reverseInteger.reverseInteger(x);
    assertNotEquals(expected1, reversed1);
}
 }
