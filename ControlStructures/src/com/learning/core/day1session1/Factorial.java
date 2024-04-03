package com.learning.core.day1session1;

public class Factorial {
    public void factorial(int num){
        Long factorialnum = 1L;
        for(int i = 1; i<=num; i++){
            factorialnum *= i;
        }
        System.out.print(factorialnum);
    }
}
