package com.cydeo.LinkedList;

public class AddFirst {

    MyNode head;
    MyNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {

        MyNode node = new MyNode(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
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

        AddFirst list1 = new AddFirst();

        for (int i = 0; i < 10; i++) {
            list1.addFirst(i);
        }

        AddFirst list2 = new AddFirst();

        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }

        list1.printNodes(); // 9=> 8=> 7=> 6=> 5=> 4=> 3=> 2=> 1=> 0=> null
        list2.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
    }
}
