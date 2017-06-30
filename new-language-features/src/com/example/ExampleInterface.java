package com.example;


public interface ExampleInterface {
     default void doSomething(String input){
    }

    default void doSomethingAlittleDifferent(String input){
        commonLogic(input);

    }

    // this would generate a compile error in Java 8
    private String commonLogic(String input){
        return input.toLowerCase();
    }
}
