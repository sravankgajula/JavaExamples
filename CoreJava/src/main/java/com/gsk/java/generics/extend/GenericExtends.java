package com.gsk.java.generics.extend;

import com.gsk.java.generics.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericExtends {

    List<Integer> vals = new ArrayList<>();

    public <T extends Number> void add(T val) {
        vals.add(val.intValue());
    }

}
