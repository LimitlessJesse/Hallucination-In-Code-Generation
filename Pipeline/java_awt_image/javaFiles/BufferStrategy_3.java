import java.awt.*;
import java.awt.image.*;

public class BufferStrategy_3 {
    public static void main(String[] args) {
        // Create a new frame
        Frame frame = new Frame("BufferStrategy Example");
        frame.setSize(300, 300);
        frame.setVisible(true);

        // Create a new buffer strategy
        BufferStrategy strategy = frame.getBufferStrategy();
        if (strategy == null) {
            // If no buffer strategy exists, create one
            frame.createBufferStrategy(2);
            strategy = frame.getBufferStrategy();
        }

        // Get the graphics context
        Graphics g = strategy.getDrawGraphics();

        // Draw something on the graphics context
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        // Dispose the graphics context
        g.dispose();

        // Show the buffer
        strategy.show();
    }
}
