import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.INFO);
        logger.info("This is an information message");
        logger.warning("This is a warning message");
    }
}
