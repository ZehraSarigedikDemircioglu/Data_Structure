package com.cydeo.QueueApp;

import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {
    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();
        for (int i = 0; i < 6; i++) {
            queue.enqueue(i);
        }
        queue.printQueue(); // 0=> 1=> 2=> 3=> 4=> 5=> null
        reverseFirstK(queue, 3).printQueue(); // 2=> 1=> 0=> 3=> 4=> 5=> null
    }

    static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k) {

        // create a stack
        Stack<Integer> stack = new Stack<>();
        // push first K elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        // enqueue elements back into the queue
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        for (int i = 0; i < queue.size - k; i++) {
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }
}
