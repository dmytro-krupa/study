package lec5.old.generic;

import lec2.oop_2022.User;

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