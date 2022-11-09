package lec7.exceptionEx;

public class ExceptionWrapper {
    public static void main(String[] args) {
        test2();
    }

    static void test1(){
        if(true){
            throw new ArithmeticException();
        }
    }

    static void test2(){
        try {
            test1();
        } catch (ArithmeticException e){
//            throw e;
//            throw new ArithmeticException();
            throw new RuntimeException("frfrf", e);
        }
    }
}


// KISS
// DRY
// YAGNI

