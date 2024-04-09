package com.learning.core.dat2session1;

import java.util.Scanner;

public class MinimumDeletoinsToPalindromeTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        MinimumDeletoinsToPalindrome m = new MinimumDeletoinsToPalindrome();
        m.minimumDeletionsToPalindrome(str);
    }
}
