package lec5;

public class Bug {
    public static void main(String[] args) {
        A a = new A();
        a.name = "some name";


        B b = new B();
        b.x = 4;

        a.b = b;
        b.a = a;

        System.out.println(a);
    }
    static class A {
        String name;
        B b;

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    ", b=" + b.x +
                    '}';
        }
    }

    static class B {
        int x;
        A a;

        @Override
        public String toString() {
            return "B{" +
                    "x=" + x +
                    ", a=" + a.name +
                    '}';
        }
    }

}
