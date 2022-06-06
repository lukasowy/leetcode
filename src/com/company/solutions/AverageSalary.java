package com.company.solutions;

/**
 * 1491. Average Salary Excluding the Minimum and Maximum Salary
 */
public class AverageSalary {
    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int j : salary) {
            min = Math.min(j, min);
            max = Math.max(j, max);
            sum += j;
        }
        return (sum - min - max) / (salary.length - 2);
    }
}
