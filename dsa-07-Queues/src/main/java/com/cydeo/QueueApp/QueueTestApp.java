package com.cydeo.QueueApp;

import com.cydeo.QueueApp.MyQueue;

public class QueueTestApp {

    public static void main(String[] args) {

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println("Size of queue is: " + myQueue.size); // 3
        System.out.println("Front is: " + myQueue.peek()); // 1
        System.out.println("First remove from queue: " + myQueue.dequeue()); // 1
        System.out.println("Front is: " + myQueue.peek()); // 2

    }
}
