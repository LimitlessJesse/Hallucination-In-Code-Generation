import javax.swing.SwingUtilities;

public class SwingUtilities_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeAndWait(new Runnable() {
            public void run() {
                // Code to be executed on EDT
                System.out.println("Hello, World!");
            }
        });
    }
}
