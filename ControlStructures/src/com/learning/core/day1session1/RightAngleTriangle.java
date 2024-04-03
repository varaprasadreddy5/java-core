package com.learning.core.day1session1;

public class RightAngleTriangle {
    public void printTriangle(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
