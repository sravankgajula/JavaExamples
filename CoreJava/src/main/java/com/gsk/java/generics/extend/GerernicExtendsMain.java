package com.gsk.java.generics.extend;

import com.gsk.java.generics.A;
import com.gsk.java.generics.B;
import com.gsk.java.generics.C;
import com.gsk.java.generics.D;
import com.gsk.java.generics.extend.GenericExtends;

public class GerernicExtendsMain {

    public static  void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        GenericExtends genericExtends = new GenericExtends();

       genericExtends.add(new Float(2));
       genericExtends.add(new Integer(4));


    }
}
