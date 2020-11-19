package lec7.exceptionEx;

public class CustomExceptionExample {
    /*
        Теми:
            1. checked i unchecked exceptions
            2. ієрархія Throwable
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            div(a,b);
        } catch (SystemException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());
        }


    }

    static int div(int a, int b) throws SystemException{
        if(b == 0){
            throw new SystemException("Divide by 0", ErrorCode.ERROR_400);
        }

        return a/b;
    }
}
