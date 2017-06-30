package com.example;

import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<Object> emptyList = List.of();
        System.out.println(emptyList);

        List<String> list = List.of("a","b","c");
        System.out.println(list);

    }
}
