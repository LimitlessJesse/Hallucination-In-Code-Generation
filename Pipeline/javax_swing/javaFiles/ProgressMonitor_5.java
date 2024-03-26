import javax.swing.ProgressMonitor;

public class ProgressMonitor_5 {
    public static void main(String[] args) {
        ProgressMonitor monitor = new ProgressMonitor(null, "Task", "Task in progress", 0, 100);
        for (int i = 0; i <= 100; i++) {
            monitor.setProgress(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        monitor.close();
    }
}
