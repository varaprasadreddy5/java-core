package com.learning.core.dat2session1;

public class Palindrome {
    public void palindromeString(String s){
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println("The length of Provided String is : " + s.length());
        boolean b = false;
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i) == s.charAt(j)){
                b = true;
            }
            i++;
            j--;
        }

        if(b){
            System.out.println("Its a palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
}
