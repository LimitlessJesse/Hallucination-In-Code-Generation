import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class StreamHandler_3 {
    public static void main(String[] args) {
        StreamHandler handler = new StreamHandler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println(record.getMessage());
            }
        };

        handler.publish(new LogRecord(null, "Hello, World!"));
    }
}
