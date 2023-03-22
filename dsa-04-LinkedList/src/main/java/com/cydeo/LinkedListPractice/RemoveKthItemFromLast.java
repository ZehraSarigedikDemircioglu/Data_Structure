package com.cydeo.LinkedListPractice;

public class RemoveKthItemFromLast {

    MyNode head;
    MyNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    public void removeKthItemFromLast(int k) {

        MyNode ptr1 = head;
        MyNode ptr2 = head;
        MyNode prev = null;

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        while (ptr2.next != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else if (ptr1 == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = ptr1.next;
            ptr1.next = null;
            size--;
        }
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

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
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

    public static void main(String[] args) {

        RemoveKthItemFromLast list1 = new RemoveKthItemFromLast();

        for (int i = 0; i < 10; i++) {
            list1.addFirst(i);
        }

        RemoveKthItemFromLast list2 = new RemoveKthItemFromLast();

        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }

        list1.printNodes(); // 9=> 8=> 7=> 6=> 5=> 4=> 3=> 2=> 1=> 0=> null
        list2.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null

        list1.removeKthItemFromLast(3); // 9=> 8=> 7=> 6=> 5=> 4=> 3=> 1=> 0=> null
        list2.removeKthItemFromLast(3); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null

        list1.printNodes();
        list2.printNodes();
    }
}
