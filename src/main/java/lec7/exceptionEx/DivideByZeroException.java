package lec7.exceptionEx;

public class DivideByZeroException extends ArithmeticException{

    public DivideByZeroException(String s) {
        super(s);
    }
}
