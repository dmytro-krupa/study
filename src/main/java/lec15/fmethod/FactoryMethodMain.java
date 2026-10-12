package lec15.fmethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Providers.SLF4J);



        logger.logMessage("some message");
    }
}
