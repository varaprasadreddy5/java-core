package com.learning.core.day4session1andsession2.Stacks;

public class StackusingLinkedListTest {
    public static void main(String[] args){
        StackusingLinkedList stack = new StackusingLinkedList();
        double[] data = {10.0, 20.0, 30.0, 40.0};
        for (double i: data) {
            stack.push(i);
        }
        stack.display();
        stack.pop();
        stack.pop();
        System.out.println();
        stack.display();
    }
}
