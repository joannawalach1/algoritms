package com.devs.exercises;

public class ReverseInteger {

    public int reverseInteger(int x) {
        long out = 0;
        while (x != 0) {
            out = out * 10 + x % 10;
            x = x / 10;
        }
        if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) out;
    }
}
