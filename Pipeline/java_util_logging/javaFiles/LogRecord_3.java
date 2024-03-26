import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LogRecord_3 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a test log message");
        logRecord.setLevel(Level.SEVERE);
        System.out.println("Log level: " + logRecord.getLevel());
    }
}
