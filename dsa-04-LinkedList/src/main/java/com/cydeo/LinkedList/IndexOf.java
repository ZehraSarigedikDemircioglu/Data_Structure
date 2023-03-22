package com.cydeo.LinkedList;

import com.cydeo.Node;

public class IndexOf {

    MyNode head;
    MyNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    int indexOf(int id) {

        if (isEmpty()){
            return -1;
        }

        int pos = 0;

        MyNode current = head;

        while (current != null) {
            if (current.id == id){
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }

    void printNodes() {

        MyNode current = head;
        while (current != null) {
            if (current.next == null){
                System.out.println(current.id + "=> null");
            } else {
                System.out.print(current.id + "=> ");
            }
            current = current.next;
        }
    }

    void add(int data) {
        // create a new node object from data
        MyNode node = new MyNode(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public static void main(String[] args) {

        IndexOf list = new IndexOf();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
        System.out.println(list.indexOf(3)); // 3
    }
}
