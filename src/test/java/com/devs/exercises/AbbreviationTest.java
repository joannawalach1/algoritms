package com.devs.exercises;

import junit.framework.TestCase;

public class AbbreviationTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testAbbreviateSentences() {
        Abbreviation abr = new Abbreviation();
        //Test case 1:
        String oldSentence = "elephant-rides are really fun!";
        String newSentence = "e6t-r3s are r4y fun!";
        assertEquals(newSentence, abr.abbreviateSentences(oldSentence));
    }
}