package lec2;

public class OOPExample {
    public static class A{
        int a;

        public A(int a) {
            this.a = a;
        }
    }

    public static class B extends A{
        int a;

        public B(int a) {
            super(6);
            this.a = a;
        }
    }

    public static class C{}


    public static void main(String[] args) {
        B b = new B(5);
        A a = b;

        System.out.println(((B)a).a);


    }
}
