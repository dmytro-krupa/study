public class FinalMethodExample {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();


        a.a();
        b.a();
    }

    static class A{
//        final public void a(){
        public void a(){
            System.out.println("A");
        }
    }

    static class B extends A{
        @Override
        public void a() {
            System.out.println("B");
        }
    }
}
