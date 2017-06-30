package com.example.lib;

import java.lang.reflect.Field;

public class ReflectionUtils {

    public Object getPrivateFieldValue(Object object, String fieldName) {
        try {
            Class<?> clazz = object.getClass();
            Field field = clazz.getDeclaredField( fieldName );
            field.setAccessible( true );
            return field.get( object );
        }
        catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException( e );
        }
    }
}