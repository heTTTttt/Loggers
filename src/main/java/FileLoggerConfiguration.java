
public class FileLoggerConfiguration {
    private String filename;
    private LoggingLevel level;
    private int maxSizeBytes;
    private String format;

    public FileLoggerConfiguration(String filename, LoggingLevel level, int maxSizeBytes, String format) {
        this.filename = filename;
        this.level = level;
        this.maxSizeBytes = maxSizeBytes;
        this.format = format;
    }

    public String getFilename() {
        return filename;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public int getMaxSizeBytes() {
        return maxSizeBytes;
    }

    public String getFormat() {
        return format;
    }
}
