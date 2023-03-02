package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt(); // O(n)

        for (int each : candies) { // O(n)
            result.add(each + extraCandies >= max);
        }
        return result;
    }
    public static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>(); // return type
        int max = candies[0];

        for (int each : candies) {
            if (each > max) {
                max = each;
            }
        } // O(n)

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        } // O(n)
        // in total we have O(n) +O(n) = O(2n) which results in O(n)
        return result;
    }
}
/*
Problem: Kids With the Greatest Number of Candies
There are n kids with candies. You are given an integer array candies, where each candies[i]
represents the number of candies the i
th kid has, and an integer extraCandies, denoting the
number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the i
th kid all
the extraCandies, they will have the greatest number of candies among all the kids, or false
otherwise.
Note that multiple kids can have the greatest number of candies.
 */

