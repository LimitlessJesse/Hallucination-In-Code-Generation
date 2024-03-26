import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_4 {
    public static void main(String[] args) {
        MyWindowAdapter adapter = new MyWindowAdapter();
        // Assuming we have a JFrame named frame
        frame.addWindowListener(adapter);
    }
}

class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowDeactivated(WindowEvent e) {
        // Your code here
        System.out.println("Window deactivated");
    }
}
