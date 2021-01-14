package lec15.fmethod;

public class JULLoggerImpl implements Logger{
    @Override
    public void logMessage(String message) {
        System.out.println("JULLoggerImpl : logMessage");
    }

    @Override
    public void logError(String message) {
        System.out.println("JULLoggerImpl : logError");
    }
}
