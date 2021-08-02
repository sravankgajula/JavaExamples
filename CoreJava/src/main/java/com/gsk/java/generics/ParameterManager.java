package com.gsk.java.generics;

import java.util.HashMap;
import java.util.Map;

public class ParameterManager {
    private Map<Parameter, ParameterValue> params = new HashMap<>();

    public <T> void set(Parameter parameter, T value) {
        this.params.put(parameter, new ParameterValue(value, parameter.getDataType()));
    }

    public <T> T get(Parameter parameter) {
        ParameterValue value = params.get(parameter);
        Class<T> dataType = parameter.getDataType();
        if (value != null) {
            return dataType.cast(value.get(dataType));
        }
        return  null;
    }
}
