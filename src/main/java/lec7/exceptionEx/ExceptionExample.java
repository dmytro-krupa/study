package lec7.exceptionEx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

    public static void main(String[] args) {
//        A a = null;

//        a.hashCode();


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.get(45);


//        io();

    }


    public static void io() throws IOException {
        A a = null;

        a.hashCode();
    }

    static class A {
    }
}
