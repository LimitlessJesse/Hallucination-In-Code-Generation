import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileHandler_5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {
            // This block configure the logger with handler and formatter
            fh = new FileHandler("C:\\log\\MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages.
            logger.info("My first log");

            // close the file handler
            fh.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
