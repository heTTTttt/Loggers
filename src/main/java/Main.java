import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new FileLogger();
        FileLoggerConfigLoader loader = new FileLoggerConfigLoader();

        logger.info("Start program");

        for (int i = 0; i < 10; i++){
            logger.debug("Current value: " + i);
        }
        loader.load("C:/GitRep/Loggers/LoggConfig.txt");

        logger.info("Program executed");
    }
}
