import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new FileLogger();

        logger.info("Start program");

        for (int i = 0; i < 100; i++){
            logger.debug("Current value: " + i);
        }

        logger.info("Program executed");
    }
}
