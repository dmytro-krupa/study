package lec7.inner_2023.anonymysClass;

import java.util.List;

public class Main {
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
}
