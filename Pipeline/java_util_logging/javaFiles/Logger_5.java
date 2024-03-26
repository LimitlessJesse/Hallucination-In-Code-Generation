import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.ALL);
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        logger.addHandler(ch);
        logger.log(Level.INFO, "This is an informational message");
    }
}
