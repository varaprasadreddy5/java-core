package com.learning.core.day4session1andsession2.Stacks;

import java.util.Stack;

public class StackUsingArray {
    public static void main(String[] args){
        String[] a = {"Hello", "World", "Java", "Programming"};
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < a.length; i++){
            stk.push(a[i]);
        }
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);




    }

}
