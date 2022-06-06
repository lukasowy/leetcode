package com.company.solutions;

/**
 * 191. Number of 1 Bits
 */
public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int counter = 0;
        for (char i : Integer.toBinaryString(n).toCharArray()) {
            if (i == '1') {
                counter++;
            }
        }
        return counter;
    }
}
