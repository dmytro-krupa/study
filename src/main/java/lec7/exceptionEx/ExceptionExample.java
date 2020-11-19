package lec7.exceptionEx;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

    public static void main(String[] args) {
        A a = null;


        List<Integer> list = new ArrayList<>();

        list.add(1);


        list.get(45);

    }

    static class A{}
}
