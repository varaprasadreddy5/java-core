package com.learning.core.day1session1;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args){
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percentage : ");
        double num = sc.nextDouble();
        if(num>100 || num<0){
            System.out.print("Invalid Percentage ");
        }
        else{
        g.gradeCheck(num);}
    }
}
