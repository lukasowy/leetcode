package com.company.solutions;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 */
public class LargestPerimeter {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int L = nums.length;
        for (int i = L - 1; i >= 2; i--) {
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];
            if (c < a + b) {
                return a + b + c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int i = largestPerimeter(new int[]{3, 6, 2, 3});
        System.out.println(i);
    }
}
