import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    FileWriter writer = new FileWriter("LoggsInfo.txt");

    public FileLogger() throws IOException {
    }

    @Override

    public void info(String message) throws IOException {
        writer.write(message);
        writer.append('\n');
        writer.flush();
        getLevel(LoggingLevel.INFO);
    }

    @Override
    public void debug(String message) throws IOException {
        writer.write(message);
        writer.append('\n');
        writer.flush();
        getLevel(LoggingLevel.DEBUG);
    }

    @Override
    public LoggingLevel getLevel(LoggingLevel level) {
        return level;
    }
}
