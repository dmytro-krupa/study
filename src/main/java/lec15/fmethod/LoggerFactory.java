package lec15.fmethod;

public class LoggerFactory {
    public static Logger getLogger(final Providers providers){
        switch (providers){
            case LOG4J:
                return new LOG4JLoggerImpl();
            case SLF4J:
                return new SLF4JLoggerImpl();
            case JUL:
            default:
                return new JULLoggerImpl();
        }
    }
}
