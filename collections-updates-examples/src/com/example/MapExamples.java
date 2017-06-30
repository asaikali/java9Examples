package com.example;


import java.util.Map;

import static java.util.Map.entry;

public class MapExamples {
    public static void main(String[] args) {
        Map<String,String> map = Map.of("key","value");
        System.out.println(map);

        Map<String,String> names = Map.of("jim@example.com","Jim Smith","alan@example.com","Alan");
        System.out.println(names);

        Map<String, String>  anotherMap = Map.ofEntries(entry("a", "b"));
        System.out.println(anotherMap);

    }
}
