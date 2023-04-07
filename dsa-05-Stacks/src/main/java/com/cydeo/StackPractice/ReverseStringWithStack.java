package com.cydeo.StackPractice;

public class ReverseStringWithStack {

    public static void main(String[] args) {

        MyStack<Character> stack = new MyStack<>();

        for (char c = 'A'; c <= 'Z'; c++) stack.push((Character) c);

        System.out.println(stack.toArray());

        for (int i = 0; i < 26; i++)
            System.out.print(stack.pop());
    }
}
