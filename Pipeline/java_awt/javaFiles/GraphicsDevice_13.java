import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GraphicsDevice_13 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        for (GraphicsDevice gd : gs) {
            System.out.println(gd.getDefaultConfiguration());
        }
    }
}
