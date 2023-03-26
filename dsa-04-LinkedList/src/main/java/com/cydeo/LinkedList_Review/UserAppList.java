package com.cydeo.LinkedList_Review;

public class UserAppList {

    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();

        list.insertLast(new UserNode("Carol", "Smith"));
        list.insertLast(new UserNode("Jack", "Reacher"));
        list.insertLast(new UserNode("John", "XXX"));
        list.printNames(); // Carol=> Jack=> John=> null
        list.deleteByName("Jack"); // Carol=> John=> null
        list.printNames();
        list.deleteByName("John"); // Carol=> null
        list.printNames();
        list.deleteByName("Carol"); // List is empty
        list.printNames();
    }
}
