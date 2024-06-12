package com.devs.exercises;

import junit.framework.TestCase;

public class LongestConsecutiveWordsTest extends TestCase {

    public void testReturnLongestConsecutive() {
        int k = 2;
        String[] strrar1 = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        String[] strrar2 = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        String result1 = "folingtrashy";
        String result2 = "abigailtheta";
        LongestConsecutiveWords longest_consecutive = new LongestConsecutiveWords();

        String longestWord1 = longest_consecutive.returnLongestConsecutive(strrar1, 2);
        String longestWord2 = longest_consecutive.returnLongestConsecutive(strrar2, 2);
        assertEquals(result1, longestWord1);
        assertEquals(result2, longestWord2);
    }
}