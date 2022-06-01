package com.company.solutions;

/**
 * 1523. Count Odd Numbers in an Interval Range
 */
public class CountOdds {
    public static int countOdds(int low, int high) {
        int helper = (high - low + 1);
        if (helper % 2 == 0) {
            return helper / 2;
        } else if (low % 2 == 1) {
            return helper / 2 + 1;
        }
        return helper / 2;
    }
}
