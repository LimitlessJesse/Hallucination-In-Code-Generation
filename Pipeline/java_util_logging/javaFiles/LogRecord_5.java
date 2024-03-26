import java.util.logging.LogRecord;

public class LogRecord_5 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        logRecord.setSourceClassName("Main");
        System.out.println("Source Class Name: " + logRecord.getSourceClassName());
    }
}
