import javax.swing.SwingUtilities;

public class SwingUtilities_3 {
    public static void main(String[] args) {
        boolean isEventDispatchThread = SwingUtilities.isEventDispatchThread();
        System.out.println("Is the current thread the event dispatch thread? " + isEventDispatchThread);
    }
}
