package lec4.old;

import java.io.Serializable;

//done
public class CastExample {
    public static void main(String[] args) {



        A a = new B();


//        a = b;


        if(a instanceof Object) {
            System.out.println(true);
        }


    }

    static class A implements Cloneable{}
    static class B extends A implements Serializable {}

}
