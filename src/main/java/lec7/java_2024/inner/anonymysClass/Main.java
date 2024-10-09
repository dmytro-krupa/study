package lec7.java_2024.inner.anonymysClass;

import lec8.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Button button1 = new Button() {
            @Override
            public void action(int a, int b) {
                System.out.println("+");
            }
        };

        Button button2 = (a, b) -> {
            System.out.println((a + b) + "");
        };

        button2.action(6, 5);

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