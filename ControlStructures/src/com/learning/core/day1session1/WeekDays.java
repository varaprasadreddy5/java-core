package com.learning.core.day1session1;

public class WeekDays {

    public void displayWeekDays(int num){
        String weekDay;

        if(num == 1){
            weekDay = "Monday";
        }
        else if(num == 2){
            weekDay = "Tuesday";
        }
        else if(num == 3){
            weekDay = "Wednesday";
        }
        else if(num == 4){
            weekDay = "Thursday";
        }
        else if(num == 5){
            weekDay = "Friday";
        }
        else if(num == 6){
            weekDay = "Saturday";
        }
        else if(num == 7){
            weekDay = "Sunday";
        }
        else{
            weekDay = "Invalid Input";
        }
        System.out.print(weekDay);
    }
}
