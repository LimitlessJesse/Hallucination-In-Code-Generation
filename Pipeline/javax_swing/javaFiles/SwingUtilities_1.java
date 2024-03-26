import javax.swing.SwingUtilities;

public class SwingUtilities_1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Code to update the UI goes here
                System.out.println("Updating UI on EDT");
            }
        });
    }
}
