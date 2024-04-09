package com.learning.core.day4session1andsession2.Stacks;

public class StackusingLinkedList {
    private  Node top;

    public StackusingLinkedList(){
        this.top = null;
    }

    public void push(double data){
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }
    public Double pop(){
        if(isEmpty()){
            return null;
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void display(){
        Node current = top;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
