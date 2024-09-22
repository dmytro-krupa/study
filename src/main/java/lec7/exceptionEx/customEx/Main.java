package lec7.exceptionEx.customEx;

public class Main {
    public static void main(String[] args) {
        testSystemException();
    }

    public static void testSystemException(){
        int a = 5;
        int b = 0;
        int c;
        try {
            c = a / b;
        } catch (ArithmeticException e){
//            throw new SystemException("system", e, 500);
        }
    }
    public static void testResourceNotFoundException() throws Exception{
//        throw new ResourceNotFoundException("resourceNotFound", 400);
    }
}
