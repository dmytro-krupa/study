package lec5.generic;

import lec2.oop.User;

import java.awt.*;

public class GenericMethodExample {
    public static void main(String[] args) {
        test(new User());
        test("test");
        test(1);
    }

    public static <T> void test(T t){
        System.out.println(t.getClass().getTypeName());
    }
}
