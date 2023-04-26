package com.cydeo.QueueApp;

import java.util.NoSuchElementException;

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
        }else{
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.value;
    }

    T peek(){
        return front.value;
    }
    int size(){
        return size;
    }
}
