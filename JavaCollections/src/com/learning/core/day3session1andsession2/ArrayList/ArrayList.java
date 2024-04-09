package com.learning.core.day3session1andsession2.ArrayList;

import java.util.List;

public class ArrayList {

    public void findName(String str){
        List<String> a = new java.util.ArrayList<>();
        a.add("Jack");
        a.add("Paul");
        a.add("Henry");
        a.add("Mary");
        a.add("Ronaldo");
        int count = 1;
        for(String s : a){
            if (s.equals(str)){
                System.out.println("Found");
                count--;
                return;
            }
        }
        if (count == 0){
            System.out.println("Not Found");
        }
    }
}
