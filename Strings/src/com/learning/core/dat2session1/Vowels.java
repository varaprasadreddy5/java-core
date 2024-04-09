package com.learning.core.dat2session1;

public class Vowels {
    public String findVowels(String str, int n){
        int count = 0;
        StringBuilder vovels = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vovels.insert(0,ch);
                //System.out.println(vovels);
                count++;
            }
        }
        if(count<n){
            System.out.println("Invalid Input");
        }
        if(count > n || count == n){
            for (int i = vovels.length() - n; i < vovels.length(); i++){
                System.out.println(vovels.charAt(i));
            }
        }
        return vovels.toString();
    }

}
