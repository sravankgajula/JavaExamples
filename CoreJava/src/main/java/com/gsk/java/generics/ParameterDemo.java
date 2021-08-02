package com.gsk.java.generics;

import java.util.ArrayList;

public class ParameterDemo {

    public static void main(String args[]) {

        ParameterManager parameterManager = new ParameterManager();

        ArrayList inClause = new ArrayList();
        inClause.add("100");
        inClause.add("102");

        parameterManager.set(DBParameter.FILE_PATH, "12345");
        parameterManager.set(DBParameter.IN_CLAUSE, inClause);

      String serverSideSqlFilePath =   parameterManager.get(DBParameter.FILE_PATH);
      ArrayList arrayListServer =   parameterManager.get(DBParameter.IN_CLAUSE);



    }
}
