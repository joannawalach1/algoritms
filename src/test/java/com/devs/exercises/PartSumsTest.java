package com.devs.exercises;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class PartSumsTest extends TestCase {

    public void testAddNumbersInArray() {
        PartSums newSum = new PartSums();
        int[] newArray1 = new int[]{21, 20, 18, 15, 11, 6, 0};
        int[] oldArray1 = newSum.addNumbersInArray(new int[]{1, 2, 3, 4, 5, 6});
        assertArrayEquals(newArray1, oldArray1);

        // Test case 2
        int[] newArray2 = new int[]{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0};
        int[] oldArray2 = newSum.addNumbersInArray(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358});
        assertArrayEquals(newArray2, oldArray2);
    }

    }
