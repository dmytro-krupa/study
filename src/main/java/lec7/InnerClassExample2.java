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



//FROM javarush

// Java allows to create class inside other class

// 1:
// An object of the inner class cannot exist
// without an object of the outer class!

// 2:
// An objects of the inner class has access
// to the variables of the outer class.

// 3:
// INCORRECT - Inner class object cannot be created in static method of outer class.
// ! CAN be created in static method of outer class !

// 4:
// INCORRECT - Inner class cannot contain static variables and methods.
// ! CAN contain static variables and methods from Java 16!

// 5:
// When creating an object of an inner class,
// its access modifier plays an important role.
// (public, private, package private, protected)

// 6:
// Access modifiers for inner classes
// work the same as for regular variables.