package com.learning.core.day1session2;

public class OccuranceArray {
    public void occuranceArray(int[] a){
        int count = 0;
        for (int i = 0; i<a.length; i++){
            for (int j = i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    count++;
                    System.out.print(a[i]);
                }
                if(count == 1){
                    break;
                }
            }

        }

    }
}
