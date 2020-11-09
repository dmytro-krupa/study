package lec7;

public class StaticInnerClassExample {
    public static void main(String[] args) {
//        System.out.println(A.x);

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
