package lec9.solid;

public class L {

    public static void main(String[] args) {
        Rectangle rectangle = new Square();

        rectangle.setA(2);
        rectangle.setB(5);

        System.out.println(rectangle.getArea());
    }


    static class Rectangle{
        protected int a;
        protected int b;

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getArea(){
            return a * b;
        }
    }


    static class Square extends Rectangle{
        public void setA(int a) {
            this.a = a;
//            this.b = a;
        }

        public void setB(int b) {
            this.a = b;
//            this.b = b;
        }
    }

//    public static void main(String[] args) {
////        A a = new A();
//        A a = new B();
//
//
//        a.go();
//        a.go();
//        a.go();
//
//        a.something();
//
//        a.go();
//        a.go();
//        a.go();
//        a.go();
//        a.go();
//    }
//
//    static class A {
//        protected boolean x = false;
//
//        public void go() {
//            System.out.println("go");
//        }
//
//        public void something(){
//            x = true;
//        }
//    }
//
//    static class B extends A{
//
//        @Override
//        public void go() {
//
//            if(x){
//                throw new ArithmeticException();
//            }
//            System.out.println("go");
//        }
//
//    }
}
