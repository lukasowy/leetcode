package com.company.solutions;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 */
public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int prod = 1;

        while (n != 0) {
            int current = n % 10;
            sum += current;
            prod *= current;
            n /= 10;
        }
        return prod - sum;
    }

    public static void main(String[] args) {
        int i = subtractProductAndSum(4563);
        System.out.println(i);
    }
}
