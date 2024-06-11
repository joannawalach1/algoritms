package com.devs.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pyramid {
    public int[][] createArrays(int number) {
        int[][] numbers = new int[number][];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                numbers[i][j] = 1;
            }
        }

        return numbers;

    }
    public void printPyramid(int[][] pyramid) {
        List<List<Integer>> pyramidList = new ArrayList<>();
        for (int[] row : pyramid) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : row) {
                rowList.add(num);
            }
            pyramidList.add(rowList);
        }
        System.out.println("pyramid(" + pyramid.length + ") => " + pyramidList);
    }
}
