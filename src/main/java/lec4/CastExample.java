package lec4;
//done
public class CastExample {
    public static void main(String[] args) {



        A a = new A();
        B b = new B();


        a = b;
    }

    static class A{}
    static class B extends A{}

}
