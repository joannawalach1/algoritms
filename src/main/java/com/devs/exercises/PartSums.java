package com.devs.exercises;

public class PartSums {

    public int[] addNumbersInArray(int[] ls) {
        int sum = 0;
        int[] result = new int[ls.length + 1];

        for (int i = ls.length - 1; i >= 0; i--) {
            sum += ls[i];
            result[i] = sum;
        }
        result[result.length - 1] = 0;
        for (int num : result) {
            System.out.print(num + " ");
        }
        return result;
    }


    }
