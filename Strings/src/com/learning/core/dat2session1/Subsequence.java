package com.learning.core.dat2session1;

public class Subsequence {
    public void subsequence(String str){
        int index = 0;
        String s = "";
        generatesubsequence(str,s,index);

    }
    public void generatesubsequence(String str, String s, int index){
        if (index == str.length()) {
            if (!s.isEmpty()) {
                System.out.print(s + ", ");
            }
            return;
        }
        generatesubsequence(str,s + str.charAt(index), index+1);

        generatesubsequence(str,s,index+1);

    }

}
