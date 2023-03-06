package com.cydeo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapReview2 {

    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        studentsMap.put(3, "Alison");

        // How to get values from a map

        List<String> list = studentsMap.values().stream().collect(Collectors.toList());
        System.out.println(list);

        // How to get values and sort them
        List<String> list2 = studentsMap.values().stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        // How to get entry Set

        // How to get Key set

        Set<Map.Entry<Integer, String>> entrySet = studentsMap.entrySet();
        System.out.println(entrySet);
        System.out.println("Printing key set");

        for (Integer integer :studentsMap.keySet()) {
            System.out.println(integer);
        }
    }
}
