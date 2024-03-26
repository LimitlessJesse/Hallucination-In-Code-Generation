import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.LogRecord;
import java.util.logging.SocketHandler;

public class CustomSocketHandler extends SocketHandler {

    private Socket socket;
    private PrintWriter writer;

    public CustomSocketHandler(String host, int port) throws IOException {
        socket = new Socket(host, port);
        OutputStream outputStream = socket.getOutputStream();
        writer = new PrintWriter(outputStream, true);
    }

    @Override
    public void publish(LogRecord record) {
        writer.println(getFormatter().format(record));
    }

    @Override
    public void close() throws SecurityException {
        writer.close();
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
