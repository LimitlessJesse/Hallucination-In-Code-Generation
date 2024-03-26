import java.io.OutputStream;
import java.util.logging.StreamHandler;

public class StreamHandler_5 {
    public static void main(String[] args) {
        StreamHandler handler = new StreamHandler();
        OutputStream out = System.out;
        handler.setOutputStream(out);
    }
}
