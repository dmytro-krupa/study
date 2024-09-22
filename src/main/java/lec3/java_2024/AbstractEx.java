package lec3.java_2024;

public class AbstractEx {

    public static void main(String[] args) {
        B b = new B();
        b.process();
    }

    static abstract class A{
        abstract void call();

        void process(){
            call();
            System.out.println("process");
        }
    }



    static class B extends A{
        @Override
        void call(){
            System.out.println("call from B");
        }

        void action(){
            process();
        }
    }
}
