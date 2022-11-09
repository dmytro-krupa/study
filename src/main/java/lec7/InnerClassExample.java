package lec7;

public class InnerClassExample {
    public static void main(String[] args) {
        InnerClassExample innerClassExample = new InnerClassExample();
        innerClassExample.test();
    }

    void test(){



        A a = new A();

        A.B b1 = a.new B();
        A.B b2 = a.getB();
        A.B b3 = new A().new B();



//        A.B b4 = a.new A.B();
//        A.B b5 = new A.B();
//        A.B b6 = new B();

        b1.testInner();

     }

    static class A{

        private int x = 1;
        private int z = 2;
        private static int s = 2;

//        public static A.B getB(){
        public A.B getB(){
//            return new A().new B();
            return new B();
        }

        private class B{
            //завжди має посилання на об'єкт зовнішнього класу

            private int z = 3;
            public void testInner(){
                System.out.println(x);
                System.out.println(z);
                System.out.println(s);
                System.out.println(A.this.z);
            }


//            public static void staticMethod(){
//                System.out.println();
//            }
        }
    }
}
