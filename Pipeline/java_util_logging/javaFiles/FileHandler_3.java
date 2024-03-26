import java.util.logging.FileHandler;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;

public class FileHandler_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        LogRecord record = new LogRecord(Level.INFO, "Logging to file");

        try {
            FileHandler fileHandler = new FileHandler("mylog.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.log(record);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
