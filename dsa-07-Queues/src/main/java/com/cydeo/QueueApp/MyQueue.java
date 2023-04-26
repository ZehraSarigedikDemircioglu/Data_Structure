package com.cydeo.QueueApp;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MyQueue<T> {

    QNode<T> front;
    QNode<T> back;
    int size;

    public MyQueue() {
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(T item) { // add

        QNode<T> qNode = new QNode<>(item);

        if (isEmpty()) {
            front = back = qNode;
        } else {
            back.next = qNode;
            back = qNode;
        }
        size++;
    }

    T dequeue() { // remove
        QNode<T> frontNode;

        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (front == back) { // only one element
            frontNode = front;
            front = back = null;
        } else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.value;
    }

    T peek() {
        return front.value;
    }

    int size() {
        return size;
    }

    void printQueue(){

        QNode<T> current = front;

        while (current != null) {
            if (current.next == null){
                System.out.println(current.value + "=> null");
            } else {
                System.out.print(current.value + "=> ");
            }
            current = current.next;
        }
    }

    MyQueue<Integer> reverseFirstKElementQueue(MyQueue<Integer> queue, int k) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        for (int i = 0; i < queue.size - k; i++) {
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }
}
