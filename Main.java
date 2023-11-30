package com.bridgelabz.ds;



public class Main {
    public static void main(String[] args) {
//

//        MyStack myStack = new MyStack();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        myStack.push(40);
//        System.out.println("poped element is ::" + myStack.pop());
//        System.out.println("peak elememnt is :: " + myStack.peak());
//
//        myStack.display();
//        System.out.println(myStack.getSize());

        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);

        System.out.println("deleted element is :: " + myQueue.dequeue());

        myQueue.display();





    }
}
