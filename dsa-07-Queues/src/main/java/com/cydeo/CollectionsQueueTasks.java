package com.cydeo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class CollectionsQueueTasks {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        PriorityQueue<String> pq = new PriorityQueue<>(); // it is a random order

        pq.add("John");
        pq.add("Michael");
        pq.add("Carol");
        System.out.println(pq.peek()); // Carol
        System.out.println(pq.remove()); // Carol
        System.out.println(pq.peek()); // John
        System.out.println(pq.remove());
        System.out.println(pq.remove()); // Michael
    }
}
