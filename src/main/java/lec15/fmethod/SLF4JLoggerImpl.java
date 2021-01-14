package lec15.fmethod;

public class SLF4JLoggerImpl implements Logger{
    @Override
    public void logMessage(String message) {
        System.out.println("SLF4JLoggerImpl : logMessage");
    }

    @Override
    public void logError(String message) {
        System.out.println("SLF4JLoggerImpl : logError");
    }
}
