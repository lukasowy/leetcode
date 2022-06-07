package com.company.solutions;

/**
 * 283. Move Zeroes
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int nxt = 0;

        for (Integer x : nums) {
            if (x != 0) {
                nums[nxt] = x;
                nxt++;
            }
        }

        for (int i = nxt; i < n; i++) {
            nums[i] = 0;

        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
