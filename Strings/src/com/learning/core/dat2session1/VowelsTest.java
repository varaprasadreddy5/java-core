package com.learning.core.dat2session1;

import java.util.Scanner;

public class VowelsTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println("Enter nbh : ");
        int n = sc.nextInt();
        Vowels v = new Vowels();
        v.findVowels(s,n);
    }
}
