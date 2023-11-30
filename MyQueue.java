package com.bridgelabz.ds;

public class MyQueue {
    int[] queue = new int[5];
    int rear;
    int front;
    int size;

    public void enqueue(int data){
        queue[rear] = data;
        rear++;
        size++;
    }

    public int dequeue(){
        int data = queue[front];
        front++;
        size--;
        return data;
    }
    public void display(){
        for (int i = 0; i<=size-1; i++){
            System.out.println(queue[i]);
        }
    }
}
