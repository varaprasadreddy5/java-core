package com.learning.core.dat2session1;

public class LongestPrefixSuffix {
    public static int longestPrefixSuffixLength(String s) {
        int n = s.length();
        int[] lps = new int[n]; // Array to store the longest prefix which is also a suffix

        // Calculate LPS array
        int i = 1;
        int length = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps[n - 1]; // Length of the longest prefix which is also a suffix
    }
}
