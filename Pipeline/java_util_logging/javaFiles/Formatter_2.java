import java.util.logging.Handler;
import java.util.logging.Logger;

public class Formatter_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        Handler handler = new Handler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println(new MyFormatter().format(record));
            }

            @Override
            public void flush() {
            }

            @Override
            public void close() throws SecurityException {
            }
        };
        logger.addHandler(handler);
        logger.info("Hello, World!");
    }
}
