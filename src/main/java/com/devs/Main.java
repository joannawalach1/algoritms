package com.devs;

import com.devs.exercises.Abbreviation;
import com.devs.exercises.LongestConsecutiveWords;
import com.devs.exercises.PartSums;
import com.devs.exercises.Pyramid;


public class Main {
    public static void main(String[] args) {
        PartSums newSum = new PartSums();
        System.out.print("Sumy cząstkowe elementów pierwszej tabeli - ");
        newSum.addNumbersInArray(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println();
        System.out.print("Sumy cząstkowe elementów drugiej tabeli - ");
        newSum.addNumbersInArray((new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358}));
        System.out.println();


        Abbreviation abr = new Abbreviation();
        String newSentence = abr.abbreviateSentences("elephant-rides are really fun!");
        System.out.println("New sentence with abbreviation - " + newSentence);

        Pyramid newArray = new Pyramid();
        int[][] pyramid1 = newArray.createArrays(8);
        int[][] pyramid2 = newArray.createArrays(3);
        newArray.printPyramid(pyramid1);
        newArray.printPyramid(pyramid2);

        LongestConsecutiveWords longest_consecutive = new LongestConsecutiveWords();
        String[] strrar1 = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        String[] strrar2 = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        String longestWord1 = longest_consecutive.returnLongestConsecutive(strrar1, 2);
        String longestWord2 = longest_consecutive.returnLongestConsecutive(strrar2, 2);
    }
}