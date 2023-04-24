package com.cydeo.PrintMiddleLL;

public class PrintMiddleNode {

    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        printMiddle(list);
    }

    public static void printMiddle(MySinglyLinkedList list){

        // create two pointers
        Node slow = list.head;
        Node fast = list.head;

        // iterate over the linkedlist
        while(fast != list.tail && fast.next != list.tail){
            slow = slow.next; // single jump
            fast = fast.next.next; // double jump
        }
        if(fast == list.tail){
            System.out.println(slow.id);
        }else{
            System.out.println(slow.id + ", " + slow.next.id);
        }

    }
}
