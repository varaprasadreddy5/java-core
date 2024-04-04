package com.learning.core.day1session2;

import java.util.Scanner;

public class OccuranceTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter integers for the array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        OccuranceArray oa = new OccuranceArray();
        oa.occuranceArray(a);

    }
}
