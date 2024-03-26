import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a test message");
        logRecord.setMessage("This is a new test message");
        logger.log(logRecord);
    }
}
