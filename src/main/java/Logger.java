import java.io.IOException;
import java.util.logging.Level;

public interface Logger {

    void info(String message) throws IOException;
    void debug(String message) throws IOException;
    public Level getLevel(Level level);
}
