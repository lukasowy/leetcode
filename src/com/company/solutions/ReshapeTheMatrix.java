package com.company.solutions;

/**
 * 566. Reshape the Matrix
 */
public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] res = new int[r][c];
        int[] helper = new int[r * c];

        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i], 0, helper, mat[0].length * i, mat[0].length);
        }

        for (int i = 0; i < r; i++) {
            if (c >= 0) System.arraycopy(helper, i * c, res[i], 0, c);
        }

        return res;
    }

}
