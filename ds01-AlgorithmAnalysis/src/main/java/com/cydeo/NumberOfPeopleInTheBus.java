package com.cydeo;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        System.out.println(countPassengers(list)); // 5
    }

    public static int countPassengers(ArrayList<int[]> stops) {

        int result = 0;

        for (int i = 0; i < stops.size(); i++) {
            result += stops.get(i)[0] - stops.get(i)[1];
        }
        return result;
    }
}
/*
There is a bus moving in the city, and it takes and drop some people in each bus stop.
You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people
get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
Your task is to return number of people who are still in the bus after the last bus station (after the last
array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus
 */
