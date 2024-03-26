import java.util.logging.LogRecord;

public class LogRecord_8 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        logRecord.setParameters(new Object[]{"param1", "param2"});
        System.out.println(logRecord.getParameters());
    }
}
