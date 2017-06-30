package com.example.app;


import com.example.app.data.Customer;
import com.example.lib.ReflectionUtils;

public class Main {
    public static void main(String[] args) {
        ReflectionUtils accessor = new ReflectionUtils();
        Object fieldValue = accessor.getPrivateFieldValue( new Customer( "Adib" ), "name" );
        assert "adib".equals( fieldValue );
    }
}
