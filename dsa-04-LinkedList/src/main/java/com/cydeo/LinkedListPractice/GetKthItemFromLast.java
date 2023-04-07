package com.cydeo.LinkedListPractice;

public class GetKthItemFromLast {

    MyNode head;
    MyNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }
    public int getKthItemFromLast(int k) {

        MyNode ptr1 = head;
        MyNode ptr2 = head;

        // move ptr2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.id;
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

        MyNode node = new MyNode(data);

        if (isEmpty()) {
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public static void main(String[] args) {

        GetKthItemFromLast list = new GetKthItemFromLast();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
        System.out.println(list.getKthItemFromLast(2)); // 8
        list.add(10);
        list.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> 10=> null
        System.out.println(list.getKthItemFromLast(2)); // 9
    }
}
