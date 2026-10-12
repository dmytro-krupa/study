package lec7.java_2024.inner.anonymysClass;

import lec8.User;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        Button plus = new Button() {
            @Override
            public void action(int a, int b) {
                System.out.println(a + b);
            }
        };


        int x = 5;

        ///........


//        plus.action(1,2);

        Button minus = (a, b) -> {
            System.out.println(a - b + x);
        };

        minus.action(6, 5);





    }
}

















/*
    public static void main(String[] args) {
        Button plus = new Button() { //implements
            @Override
            public void action() {
                System.out.println("+");
            }
        };

        Button minus = new Button() { //implements
            @Override
            public void action() {
                System.out.println("-");
            }
        };

        plus.action();
        minus.action();
    }
 */