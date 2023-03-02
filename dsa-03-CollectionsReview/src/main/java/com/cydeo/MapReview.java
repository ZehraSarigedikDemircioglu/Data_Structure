package com.cydeo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {

    public static void main(String[] args) {
        // create hash map
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");

        System.out.println("------------------------------------");
        String str = "JJava DDevellooper";

        System.out.println(findFirstNonRepeating(str)); // null
    }

    public static Character findFirstNonRepeating(String str) {

        str = str.replace(" ", "");
        // create a map : this will cost me space complexity O(n)
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count;
        // count the frequency of chars
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else{
                map.put(ch, 1);
            }
        }

        // start from the beginning and check if there is a char with frequency 1
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1){
                return ch;
            }
        }
        return null;
    }
}
