package com.cydeo;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {

    public static void main(String[] args) {

        System.out.println(romanToInteger("CXVII")); // 117
        System.out.println(romanToInteger("DXCI")); // 591
        System.out.println(romanToInteger("CMXCIV")); // 994
    }

    public static int romanToInteger(String s) {

        Map<String, Integer> values = new HashMap<>();
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }
            if (currentValue < nextValue) {
                sum += (nextValue - currentValue);
                // make a double jump - Both exp evaluated
                i += 2;
            } else {
                sum += currentValue;
                i++;
            }
        }
        return sum;
    }
}
