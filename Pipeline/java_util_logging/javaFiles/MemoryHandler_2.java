import java.util.logging.LogRecord;
import java.util.logging.MemoryHandler;

public class MemoryHandler_2 {
    public static void main(String[] args) {
        MemoryHandler handler = new MemoryHandler();
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is a test log message");
        handler.push(record);
    }
}
