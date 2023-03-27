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
    public void removeKthFromLast2(int k) {

        MyNode ptr1 = head;
        MyNode ptr2 = head;
        for (int i = 0; i < k - 1; i++) {

            ptr2 = ptr2.next;

            if (ptr2 == null) System.out.println("Less than k elements");

            else if (ptr2.next == null) {
                head = ptr1.next;
                ptr1.next = null;
                return;
            }
        }
        while (ptr2.next.next != null) {

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }

        ptr1.next = ptr1.next.next;

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

        list1.removeKthItemFromLast(3);
        list1.printNodes(); // 9=> 8=> 7=> 6=> 5=> 4=> 3=> 1=> 0=> null

        list2.removeKthItemFromLast(3);
        list2.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null

        list1.removeKthFromLast2(3);
        list1.printNodes(); // 9=> 8=> 7=> 6=> 5=> 4=> 1=> 0=> null

        list2.removeKthFromLast2(3);
        list2.printNodes(); // 0=> 1=> 2=> 3=> 4=> 5=> 8=> 9=> null

        list1.removeKthFromLast2(6);
        list1.printNodes(); // 9=> 8=> 6=> 5=> 4=> 1=> 0=> null

        list2.removeKthFromLast2(6);
        list2.printNodes(); // 0=> 1=> 3=> 4=> 5=> 8=> 9=> null

        list1.add(100);
        list1.printNodes(); // 9=> 8=> 6=> 5=> 4=> 1=> 0=> 100 => null
        list1.removeKthItemFromLast(1);
        list1.printNodes(); // 9=> 8=> 6=> 5=> 4=> 1=> 0=> null

        list2.addFirst(100);
        list2.printNodes(); // 100 => 0=> 1=> 3=> 4=> 5=> 8=> 9=> null
    }
}
