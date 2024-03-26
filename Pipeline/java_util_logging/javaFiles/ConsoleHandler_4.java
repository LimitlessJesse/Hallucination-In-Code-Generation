import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;

public class ConsoleHandler_4 {
    public static void main(String[] args) {
        ConsoleHandler handler = new ConsoleHandler();
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is a test log message");
        handler.publish(record);
    }
}
