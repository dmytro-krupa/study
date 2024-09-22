package lec7.exceptionEx.customEx;

public class SystemException extends RuntimeException{
    private int status;

//    public SystemException(String message, int status) {
//        super(message);
//        this.status = status;
//    }

    public SystemException(String message, Throwable cause, int status) {
        super(message, cause);
        this.status = status;
    }
}
