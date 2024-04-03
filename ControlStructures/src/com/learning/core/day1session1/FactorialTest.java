package com.learning.core.day1session1;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args){
        Factorial fact = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        fact.factorial(num);
    }
}
