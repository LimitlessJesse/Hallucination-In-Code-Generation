import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.ProgressMonitor;

public class ProgressMonitor_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Progress Monitor Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);

                JProgressBar progressBar = new JProgressBar();
                progressBar.setMinimum(0);
                progressBar.setMaximum(100);

                ProgressMonitor monitor = new ProgressMonitor(frame, "Please wait...", "Loading...", 0, 100);
                monitor.setProgress(50);

                frame.add(progressBar);
                frame.setVisible(true);
            }
        });
    }
}
