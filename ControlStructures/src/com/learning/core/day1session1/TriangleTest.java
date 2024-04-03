package com.learning.core.day1session1;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args){
        RightAngleTriangle triangle = new RightAngleTriangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in triangle : ");
        int rows =sc.nextInt();
        triangle.printTriangle(rows);
    }
}
