import java.util.logging.Logger;

public class Handler_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        MyHandler handler = new MyHandler();
        logger.addHandler(handler);
        logger.info("This is an info message");
    }
}
