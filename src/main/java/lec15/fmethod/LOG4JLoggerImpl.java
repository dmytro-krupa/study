package lec15.fmethod;

public class LOG4JLoggerImpl implements Logger{
    @Override
    public void logMessage(String message) {
        System.out.println("LOG4JLoggerImpl : logMessage");
    }

    @Override
    public void logError(String message) {
        System.out.println("LOG4JLoggerImpl : logError");
    }
}
