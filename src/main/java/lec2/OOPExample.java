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

    public static class C extends A{
        public C(int a) {
            super(a);
        }
    }

    public static void main(String[] args) {
        B b = new B(5);
        A a = b;

//        C c = new C(2);

//        a = c;

        System.out.println(((A)b).a);
        System.out.println(a.a);


//        System.out.println(a instanceof C);




//        System.out.println(((B)a).a);


    }
}
