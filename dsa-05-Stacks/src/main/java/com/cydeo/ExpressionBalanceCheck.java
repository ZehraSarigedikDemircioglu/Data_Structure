package com.cydeo;

import com.cydeo.Stacks.MyStack;

public class ExpressionBalanceCheck {

    public static void main(String[] args) {

        System.out.println(balanceCheck("(A*C) + ({V-M})")); // true
        System.out.println(balanceCheck("(A*C) + ({V-M}))")); // false
        System.out.println(balanceCheck("(A*C) + (({V-M}))")); // true

    }

    public static boolean balanceCheck(String expr) {

        // create a stack
        MyStack<Character> myStack = new MyStack<>();

        // iterate over exp
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);

            // filter non-player chars
            if (ch != '(' || ch != '[' || ch != '{' || ch != '}' || ch != ')' || ch != ']'){
                continue;
            }

            // if it is a symbol to be processed
            // if opening symbol push it to the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                // Push the element in the stack
                myStack.push(ch);
                continue;
            }
            // at this point this is a closing symbol
            // stack should not be empty
            if (myStack.isEmpty()){
                return false;
            }
            switch(ch) {
                case ')':
                    if(myStack.pop()!='('){
                        return false;
                    }
                    break;
                case ']':
                    if(myStack.pop()!='['){
                        return false;
                    }
                    break;
                case '}':
                    if(myStack.pop()!='{'){
                        return false;
                    }
                    break;
            }
        } // end of for-loop

        // return if stack is empty
        return myStack.isEmpty();
    }
}
