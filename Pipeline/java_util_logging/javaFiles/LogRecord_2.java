import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        record.setLoggerName("MyLogger");
        logger.log(record);
    }
}
