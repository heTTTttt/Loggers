import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

public class FileLogger implements Logger {

    FileWriter writer = new FileWriter("LoggsInfo.txt");

    public FileLogger() throws IOException {
    }

    @Override

    public void info(String message) throws IOException {
        writer.write(message);
        writer.append('\n');
        writer.flush();
        getLevel(Level.INFO);
    }

    @Override
    public void debug(String message) throws IOException {
        writer.write(message);
        writer.append('\n');
        writer.flush();
        getLevel(Level.ALL);
    }

    @Override
    public Level getLevel(Level level) {
        return level;
    }
}
