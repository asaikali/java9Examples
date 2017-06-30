package com.example;


public class MainSupressTerminalWarning {



    @SuppressWarnings("removal")
    public static void main(String[] args) {

        OldApiNormalDeprecation oldApiNormalDeprecation;

        oldApiNormalDeprecation= new OldApiNormalDeprecation();

        oldApiNormalDeprecation.doSomething();

        OldApiTerminalDeprecation terminalDeprecation;

        terminalDeprecation = new OldApiTerminalDeprecation();
        
        terminalDeprecation.doSomething();
    }
}
