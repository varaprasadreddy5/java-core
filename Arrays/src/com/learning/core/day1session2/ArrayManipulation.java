package com.learning.core.day1session2;

import java.util.Arrays;

public class ArrayManipulation {
    public void arrayManipulation(){
        int[] a = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        int sum = 0;
        int smallnum = a[0];
        double average = 0L;
        for(int i = 0; i < 14; i++){
            sum += a[i];
            a[15] = sum;
            average = sum/14;
            a[16] = (int) average;
            if(a[i] < smallnum){
                smallnum = a[i];
                a[17] = smallnum;
            }
        }

        System.out.print(Arrays.toString(a));
    }
}
