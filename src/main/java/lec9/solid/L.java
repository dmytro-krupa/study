package lec9.solid;

public class L {

    public static void main(String[] args) {
//        A a = new A();
        A a = new B();


        a.go();
        a.go();
        a.go();

        a.something();

        a.go();
        a.go();
        a.go();
        a.go();
        a.go();
    }

    static class A {
        protected boolean x = false;

        public void go() {
            System.out.println("go");
        }

        public void something(){
            x = true;
        }
    }

    static class B extends A{

        @Override
        public void go() {

            if(x){
                throw new ArithmeticException();
            }
            System.out.println("go");
        }

    }
}
