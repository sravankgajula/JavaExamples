package com.gsk.java.generics;

import java.util.List;

public enum DBParameter implements Parameter {

    FILE_PATH("key.file.path", String.class),
    IN_CLAUSE("in.clause", List.class),
    ORDER_BY("orderby", List.class);

    DBParameter(String name, Class dataType) {
      this.name = name;
      this.dataType = dataType;
    }

    private String name;
    private Class dataType;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Class getDataType() {
        return dataType;
    }
}
