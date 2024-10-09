package lec7.exceptionEx;

public class ExceptionWrapper {
    public static void main(String[] args) {
        test2();
    }

    static void test1() {
        int x = 4 / 0;
    }

    static void test2() {
        try {
            test1();
        } catch (ArithmeticException e) {
//            throw e;
//            throw new NullPointerException();
//            throw new RuntimeException("something inside test1()", e);

            var divideByZeroException = new DivideByZeroException("somebody try divide by 0 in method test1()");
            throw new RuntimeException(divideByZeroException);
        }
    }

}


