package com.devs.exercises;

import junit.framework.TestCase;
import static org.junit.Assert.assertArrayEquals;

public class PyramidTest extends TestCase {

    public void testCreateArrays() {
        Pyramid newArray = new Pyramid();
        int[][] result1 = newArray.createArrays(4);
        int[][] result2 = newArray.createArrays(3);
        int[][] expected1 = {{1}, {1, 1}, {1, 1, 1}, {1, 1, 1, 1}};
        int[][] expected2 = {{1}, {1, 1}, {1, 1, 1}};
        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
    }
}