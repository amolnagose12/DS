package com.bridgelabz.ds;

public class MyStack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top]=0;
        return data;
    }

    public void display(){
        for (int n:stack) {
            System.out.println(n);
        }
    }
    public int peak(){
        int data;
        data = stack[top-1];
        return data;
    }

    public int getSize(){
        return top;
    }



}
