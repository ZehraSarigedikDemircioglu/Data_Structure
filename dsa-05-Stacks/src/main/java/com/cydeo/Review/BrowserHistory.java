package com.cydeo.Review;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> history, forwardStack;
    String currentPage;

    public BrowserHistory(String homepage) {

        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = homepage;
    }

    public void visit(String url) {

        history.push(currentPage);
        currentPage = url;
        forwardStack = new ArrayDeque<>();
    }

    public String back(int steps) {

        while(steps > 0 && !history.isEmpty()) {

            forwardStack.push(currentPage);
            currentPage = history.pop();
            steps--;
        }
       return currentPage;
    }

    public String forward(int steps) {

        while(steps > 0 && !forwardStack.isEmpty()) {

            history.push(currentPage);
            currentPage = forwardStack.pop();
            steps--;
        }
        return currentPage;
    }
}
