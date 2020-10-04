package lec2;

public class AccessExample {

     static class A{
        private int a = 1;
        int b= 2;
        protected int c = 3;
        public int d = 4;
    }

    static class B extends A{

    }

    public static void main(String[] args) {
        A a = new A();
//        B a = new B();

        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }

}
