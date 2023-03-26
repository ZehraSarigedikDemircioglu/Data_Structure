package com.cydeo.LinkedList_Review;


public class UserLinkedList {

    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList() {
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertLast(UserNode userNode) {

        UserNode node = new UserNode(userNode.name, userNode.lastName);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
        }
        size++;

    }

    void printNames() {

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        UserNode current = head;
        System.out.println();
        while (current != null) {
            System.out.println(current.name + "=> null");
            current = current.next;

            if (current == null) {
                System.out.print("null");
            }
        }
    }

    void deleteByName(String name) {

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        UserNode prev = head;
        UserNode current = head;

        while (current != null) {
            if (current.name.equals(name)) { // found delete it
                //case 1: head
                if (current == head) { // case 1 : head
                    if (head == tail) {
                        tail = null;
                    }
                    head = current.next;
                    current.next = null; // break reference from current
                }else if (current == tail) { // case 2 : tail
                    tail = prev;
                    prev.next = null; // ex -tail will be eligible for Garbage Collection
                } else { // case 3 : middle
                    prev.next = current.next;
                    current.next = null; // current will be eligible for Garbage Collection
                }
                size--; // after deletion
            }
            prev = current;
            current = current.next;
        }
    }
}
