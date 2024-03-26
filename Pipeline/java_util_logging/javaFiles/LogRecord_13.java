import java.util.ResourceBundle;
import java.util.logging.LogRecord;

public class LogRecord_13 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        ResourceBundle bundle = ResourceBundle.getBundle("myBundle");
        logRecord.setResourceBundle(bundle);
    }
}
