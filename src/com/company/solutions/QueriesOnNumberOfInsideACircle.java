package com.company.solutions;

/**
 * 1828. Queries on Number of Points Inside a Circle
 */

public class QueriesOnNumberOfInsideACircle {

    public static int[] countPoints(int[][] points, int[][] queries) {

        int[] results = new int[queries.length];

        for (int[] point : points) {

            int x1 = point[0];
            int y1 = point[1];

            for (int i = 0; i < queries.length; i++) {

                int x2 = queries[i][0];
                int y2 = queries[i][1];
                int radius = queries[i][2];

                double length = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

                if (length <= radius * radius) {
                    results[i]++;
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        countPoints(points, queries);
    }

}
