package com.learning.core.day1session2;

public class Searching {
    public void searchArray(int num1, int num2, int[] a){
        int count =0;

        for (int i = 0; i<a.length;i++){
            if(num1==a[i]){
                count++;
            }
            if(num2==a[i]){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Its Bingo");
        }
        else
            System.out.print("Not Found");
    }
}
