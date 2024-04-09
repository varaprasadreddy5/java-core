package com.learning.core.dat2session1;

public class MinimumDeletoinsToPalindrome {

    public void minimumDeletionsToPalindrome(String str){
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        String str2 = reversed.toString();
        char[] a1 = str.toCharArray();
        char[] a2 = str2.toCharArray();
        int count = 0;
        for (int i = 0; i < a1.length; i++){
            if(a1[i] != a2[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
