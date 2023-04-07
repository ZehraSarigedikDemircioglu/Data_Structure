package com.cydeo;

public class MyStack<T> {

    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom == null;
    }

    public void push(T item){

        SNode<T> node = new SNode<>((SNode) item);

        if(isEmpty()){
            bottom = top = node;
        }else{
            top.next = node;
            top = node;
        }
        size++;
    }

    //public T peek()
}
