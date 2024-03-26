import java.util.logging.StreamHandler;
import java.util.logging.Logger;

public class StreamHandler_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        StreamHandler streamHandler = new StreamHandler();
        logger.addHandler(streamHandler);
        logger.info("This is a log message");
        streamHandler.close();
    }
}
