import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class BufferStrategy_2 {
    public static void main(String[] args) {
        BufferStrategy bs = getBufferStrategy(); // Assume this method returns a BufferStrategy
        if (bs == null) {
            createBufferStrategy(2);
            bs = getBufferStrategy();
        }

        Graphics g = bs.getDrawGraphics();
        // Draw your graphics here
        g.dispose();

        bs.show();
        bs.dispose();
    }
}
