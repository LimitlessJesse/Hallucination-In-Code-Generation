import java.util.logging.Logger;

public class Logger_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        Logger parentLogger = Logger.getLogger("ParentLogger");
        
        logger.setParent(parentLogger);
    }
}
