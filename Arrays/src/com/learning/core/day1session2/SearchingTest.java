package com.learning.core.day1session2;

import java.util.Scanner;

public class SearchingTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] a = new int[5];
        System.out.println("Enter 5 integers for the array :");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        Searching s = new Searching();
        s.searchArray(num1,num2,a);
        sc.close();
    }
}
