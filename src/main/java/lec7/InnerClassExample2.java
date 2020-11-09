package lec7;

public class InnerClassExample2 {
    public static void main(String[] args) {
        InnerClassExample2 innerClassExample = new InnerClassExample2();

        innerClassExample.test();
    }

    void test(){
        A a = new A();

        SomeInterface someInterface = a.getSome();
        someInterface.some();
    }

    public interface SomeInterface{
        void some();
    }

    class A{

        private int x = 10;
        private int z = 20;

        public SomeInterface getSome(){
            return false ? new B() : new C();
        }

        private class B implements SomeInterface{
            private int z = 30;

            @Override
            public void some() {
                System.out.println("some from A.B");
            }
        }

        private class C implements SomeInterface{
            private int z = 40;
            @Override
            public void some() {
                System.out.println("some from A.C");
            }
        }
    }

}
