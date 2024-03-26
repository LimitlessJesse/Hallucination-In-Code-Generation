import java.util.logging.StreamHandler;
import java.util.logging.Logger;

public class StreamHandler_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        StreamHandler streamHandler = new StreamHandler();
        logger.addHandler(streamHandler);

        logger.info("This is a test message");
        streamHandler.flush();
    }
}
