package com.company.solutions;

/**
 * 1572. Matrix Diagonal Sum
 */
public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            sum += mat[i][i];
        }
        for (int i = length - 1; i >= 0; i--) {
            sum += mat[i][length - i - 1];
        }
        return length % 2 == 0 ? sum : sum - mat[length / 2][length / 2];
    }
}
