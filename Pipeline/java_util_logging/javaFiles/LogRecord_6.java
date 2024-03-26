import java.util.logging.LogRecord;

public class LogRecord_6 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        logRecord.setSourceMethodName("main");
        System.out.println(logRecord.getSourceMethodName());
    }
}
