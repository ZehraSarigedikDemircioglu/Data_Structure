package com.cydeo;

public class SNode<T> {

    public T value;
    SNode next;

    public SNode(SNode next) {
        this.next = next;
    }
}
