package com.example;

public class Main {

    public static void main(String[] args) {

        OldApiNormalDeprecation oldApiNormalDeprecation;

        oldApiNormalDeprecation= new OldApiNormalDeprecation();

        oldApiNormalDeprecation.doSomething();

        OldApiTerminalDeprecation terminalDeprecation;

        terminalDeprecation = new OldApiTerminalDeprecation();

        terminalDeprecation.doSomething();
    }
}
