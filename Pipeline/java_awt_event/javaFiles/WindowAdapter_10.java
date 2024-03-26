import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_10 extends WindowAdapter {
    public static void main(String[] args) {
        // Create a new window
        Window window = new Window();

        // Add a WindowAdapter to the window
        window.addWindowListener(new Main());

        // Simulate a window state change
        window.setState(Window.NORMAL);
    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        // This method is called when the window's state changes
        System.out.println("Window state changed: " + e.getNewState());
    }
}
