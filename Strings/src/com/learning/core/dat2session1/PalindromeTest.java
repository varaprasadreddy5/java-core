package com.learning.core.dat2session1;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        Palindrome p = new Palindrome();
        p.palindromeString(s);
    }
}
