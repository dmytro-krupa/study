package lec7.exceptionEx;

public class SystemException extends Exception{
    private ErrorCode errorCode;

    public SystemException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
