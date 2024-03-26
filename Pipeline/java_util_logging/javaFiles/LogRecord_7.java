import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_7 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        LogRecord logRecord = new LogRecord(java.util.logging.Level.SEVERE, "This is a test log message");
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            logRecord.setThrown(e);
        }
        logger.log(logRecord);
    }
}
