package com.cydeo.LinkedList_Review;

public class UserAppList {

    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();
        list.insertLast(new UserNode("Carol", "Smith"));
        list.insertLast(new UserNode("Jack", "Reacher"));
        list.insertLast(new UserNode("John", "XXX"));
        list.printNames();
        list.deleteByName("Carol");
        list.printNames();
    }
}
