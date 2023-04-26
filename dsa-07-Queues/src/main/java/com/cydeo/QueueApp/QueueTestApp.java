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

        MyQueue<Integer> myQueue2 = new MyQueue<>();
        for (int i = 0; i < 10; i++) {
            myQueue2.enqueue(i);
        }
        myQueue2.printQueue(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
        myQueue2.reverseFirstKElementQueue(myQueue2, 3).printQueue(); // 2=> 1=> 0=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
    }
}
