package com.example;

import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {

        Set<Object> emptySet = Set.of();
        Set<Integer> ints = Set.of(1,2,3);

        System.out.println(emptySet);
        System.out.println(ints);
    }
}
