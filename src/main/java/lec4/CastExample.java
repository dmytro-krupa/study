package lec4;

public class CastExample {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        b = (B)a;
    }

    static class A{}
    static class B extends A{}

}
