package com.learning.core.day1session2;

import java.util.Arrays;

public class DistinctCombinations {
    public void combinations(int k, int[] a) {
        if (k <= 0 || k > a.length) {
            System.out.println("Invalid input");
        } else {
            int[] combi = new int[k];
            generateCombinations(a, combi, 0, 0, k);
        }
    }

    public void generateCombinations(int[] a, int[] combi, int start, int index, int k) {
        if (index == k) {
            // Print combination
            for (int i = 0; i < k; i++) {
                System.out.print(combi[i]);
                if (i != k - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < a.length; i++) {
            combi[index] = a[i];
            generateCombinations(a, combi, i + 1, index + 1, k);
        }
    }
}
