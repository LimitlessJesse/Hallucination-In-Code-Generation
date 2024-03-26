import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class BufferStrategy_1 {
    public static void main(String[] args) {
        BufferStrategy bs = getBufferStrategy(); // Assume this method returns a BufferStrategy
        if (bs == null) {
            return;
        }

        Graphics g = bs.getDrawGraphics();
        if (g == null) {
            return;
        }

        // Draw your graphics here

        g.dispose();

        if (bs.contentsLost()) {
            System.out.println("Contents lost");
        } else {
            System.out.println("Contents not lost");
        }

        bs.show();
    }
}
