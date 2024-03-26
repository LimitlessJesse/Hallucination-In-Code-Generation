import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Handler_5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + ": " + record.getMessage() + "\n";
            }
        });
        logger.addHandler(handler);
        logger.info("This is an information message");
    }
}
