package com.learning.core.day1session1;

import java.util.Scanner;

public class WeekDayTest {
    public static void main(String[] args){
        WeekDays wd = new WeekDays();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day Number : ");
        int num = sc.nextInt();
        wd.displayWeekDays(num);
    }
}
