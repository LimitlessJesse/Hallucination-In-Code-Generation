import java.util.logging.Logger;

public class Logger_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setUseParentHandlers(false);
    }
}
