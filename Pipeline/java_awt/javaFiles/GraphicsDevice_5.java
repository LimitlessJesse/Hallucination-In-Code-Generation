import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GraphicsDevice_5 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        for (int i = 0; i < gs.length; i++) {
            System.out.println("Graphics Device " + i + ": " + gs[i].getIDstring());
            System.out.println("Configurations: ");
            for (int j = 0; j < gs[i].getConfigurations().length; j++) {
                System.out.println(gs[i].getConfigurations()[j]);
            }
        }
    }
}
