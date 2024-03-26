import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotionAdapter_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        frame.add(panel);

        frame.setVisible(true);
    }

    static class MyPanel extends JPanel {
        private int x, y;

        public MyPanel() {
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    int newX = e.getX();
                    int newY = e.getY();
                    if (x > 0 && y > 0) {
                        Graphics g = getGraphics();
                        g.drawLine(x, y, newX, newY);
                        g.dispose();
                    }
                    x = newX;
                    y = newY;
                }
            });
        }
    }
}
