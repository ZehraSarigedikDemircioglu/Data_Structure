package com.cydeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {

        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST";

        System.out.println(sunsetViews(buildings, direction)); // [1, 3, 6, 7]

        String direction2 = "WEST";

        System.out.println(sunsetViews(buildings, direction2)); // [0, 1]
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

//        Stack<Integer> stack = new Stack<>();
//
//        if (buildings.length == 0) {
//            return new ArrayList<>();
//        }
//
//        for (int i = 0; i < buildings.length; i++) {
//
//            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
//                stack.pop();
//            }
//            stack.push(i);
//        }
//        return new ArrayList<Integer>(stack);

        Stack<Integer> stack = new Stack<>();// stack to hold building indicies that can see sunset
        // this part is for East by default
        int i = 0;
        int step = 1;
        // this part is for west
        if (direction.equalsIgnoreCase("west")) {
            i = buildings.length - 1;
            step = -1;
        }
        while (i >= 0 && i < buildings.length) {

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
            i += step;
        }
        // now I have a stack with the building indices that can see sunset
        if (direction.equalsIgnoreCase("west")){
            Collections.reverse(stack);
        }
        return new ArrayList<Integer>(stack);
    }
}
