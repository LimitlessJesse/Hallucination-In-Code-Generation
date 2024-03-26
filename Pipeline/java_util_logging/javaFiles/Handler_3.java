import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Handler_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        logger.severe("Severe message");
        logger.warning("Warning message");
        logger.info("Info message");
        logger.config("Config message");
        logger.fine("Fine message");
        logger.finer("Finer message");
        logger.finest("Finest message");
        handler.flush();
    }
}
