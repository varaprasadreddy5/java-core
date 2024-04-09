package com.learning.core.dat2session1;

import java.util.Scanner;

public class Subsequencetest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        Subsequence ss = new Subsequence();
        ss.subsequence(str);

    }
}
