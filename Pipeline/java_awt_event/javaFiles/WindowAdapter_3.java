import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_3 extends WindowAdapter {
    public static void main(String[] args) {
        // Create a new window
        Window window = new Window();

        // Add a WindowListener to the window
        window.addWindowListener(new Main());

        // Display the window
        window.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // This method is called when the window is closed
        System.out.println("Window is closing");
    }
}
