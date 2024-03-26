import java.io.IOException;
import java.nio.channels.Pipe;

public class Pipe_2 {
    public static void main(String[] args) throws IOException {
        Pipe pipe = Pipe.open();
        Pipe.SinkChannel sinkChannel = pipe.sink();
        // Now you can write to the sinkChannel
    }
}
