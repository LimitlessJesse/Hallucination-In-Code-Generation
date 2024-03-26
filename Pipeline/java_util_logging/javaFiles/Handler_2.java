import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Handler_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.log(Level.INFO, "This is a log message");
        handler.close();
    }
}
