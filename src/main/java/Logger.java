import java.io.IOException;

public interface Logger {

    void info(String message) throws IOException;
    void debug(String message) throws IOException;
    public LoggingLevel getLevel(LoggingLevel level);
}
