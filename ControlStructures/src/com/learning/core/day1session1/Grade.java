package com.learning.core.day1session1;


public class Grade {
    public void gradeCheck(double num){
        String grade;
        if( num<=100 && num >= 60){
            grade = "Grade A";
        }
        else if(num >= 45 ){
            grade = "Grade B";
        }
        else if(num >= 35 ){
            grade = "Grade C";
        }
        else {
            grade = "Fail";
        }
        System.out.print(grade);
    }
}
