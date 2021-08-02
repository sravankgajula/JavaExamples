package com.gsk.java.generics;

public class ParameterValue<T> {
    private final T value;
    private final Class<T> type;
  


    public ParameterValue(T value, Class<T> type) {
        this.type = type;
        this.value = value;
    }

    public T get(Class<T> type) {
        if (type.isAssignableFrom(this.type)) {
            return value;
        }
        return null;
    }
}
