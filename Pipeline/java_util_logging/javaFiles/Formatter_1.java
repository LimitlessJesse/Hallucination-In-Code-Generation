import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;

public class Formatter_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new CustomFormatter());
        logger.addHandler(handler);

        logger.info("This is an information message");
        logger.warning("This is a warning message");
    }
}
