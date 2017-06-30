package com.example;

/**
 * Created by asaikali on 6/30/17.
 *
 * @deprecated really old code you should not do this
 */
@Deprecated(forRemoval = false, since = "1.1")
public class OldApiNormalDeprecation {

    @Deprecated(since="1.0")
    public void doSomething(){
        System.out.println("OldApiNormalDeprecation.doSomething");
    }
}
