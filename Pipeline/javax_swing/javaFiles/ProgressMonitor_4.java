import javax.swing.ProgressMonitor;

public class ProgressMonitor_4 {
    public static void main(String[] args) {
        ProgressMonitor progressMonitor = new ProgressMonitor(null, "Progress Monitor", "Task", 0, 100);
        progressMonitor.setNote("This is a note");
    }
}
