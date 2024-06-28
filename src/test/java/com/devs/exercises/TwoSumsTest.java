package com.devs.exercises;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class TwoSumsTest extends TestCase {

    @Test
    public void testTwoSums() {
        TwoSums twoSums = new TwoSums();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSums.twoSums(nums, target));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        assertArrayEquals(expected2, twoSums.twoSums(nums2, target2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, twoSums.twoSums(nums3, target3));

        int[] nums4 = {-3, 4, 3, 90};
        int target4 = 0;
        int[] expected4 = {0, 2};
        assertArrayEquals(expected4, twoSums.twoSums(nums4, target4));

        int[] nums5 = {1, 2, 3};
        int target5 = 7;
        assertThrows(IllegalArgumentException.class, () -> {
            twoSums.twoSums(nums5, target5);
        });
    }
}