package com.cydeo;

public class StackApp {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println(stack.peek()); // 4

        stack.push(10); // 10

        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop() + " "); // 4 3 2 1
        }
        System.out.println(stack.peek()); // 0
    }
}
