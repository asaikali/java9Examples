package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class Main {

    public void readFile(InputStream stream){

        try(stream) { // this line would generate a compile time error in Java 8
            stream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dimondOperatorOnAnonymousClasses()
    {
        // A compile-time error in Java 8
        Callable<Integer> c = new Callable<>() {
            @Override
            public Integer call() {
                return 100; }
        };
    }

    public static void main(String[] args) {



    }
}
