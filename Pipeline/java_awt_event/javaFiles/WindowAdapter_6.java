import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_6 {
    public static void main(String[] args) {
        MyWindowAdapter adapter = new MyWindowAdapter();
        // Assuming we have a JFrame named frame
        frame.addWindowListener(adapter);
    }
}

class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowIconified(WindowEvent e) {
        // Your code here
        System.out.println("Window is iconified");
    }
}
