package com.learning.core.day1session2;

import java.util.Scanner;

public class CombinationTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter integers for the array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Valur of k : ");
        int k = sc.nextInt();
        DistinctCombinations dc = new DistinctCombinations();
        dc.combinations(k,a);
    }
}
