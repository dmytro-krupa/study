package lec7;

public class StaticInnerClassExample {
    public static void main(String[] args) {
        A.B ab = new A.B();

    }

    static class A{
        int x;
        static int y;
        private static int z;

        static class B{
            void test(){
//                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }
    }
}
