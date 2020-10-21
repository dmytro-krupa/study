package exceptionEx;

public class CustomExceptionExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            div(a,b);
        } catch (SystemException e) {
            System.out.println(e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());
        }


    }

    static int div(int a, int b) {
        if(b == 0){
            throw new SystemException("Divide by 0", ErrorCode.ERROR_400);
        }

        return a/b;
    }
}
