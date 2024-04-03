package com.learning.core.day1session1;

import java.util.Scanner;

public class MonthTest {
    public static void main(String[] args) {

        Month m = new Month();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month : ");
        int num = sc.nextInt();
        m.displayMonth(num);
    }
}
