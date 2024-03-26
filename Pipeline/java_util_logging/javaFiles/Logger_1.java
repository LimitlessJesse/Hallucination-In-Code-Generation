import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;

public class Logger_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
        logger.addHandler(handler);
    }
}
