import javax.swing.SwingWorker;

public class SwingWorker_3 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Your task here
                return null;
            }
        };

        worker.execute();

        // Check if the task has been cancelled
        if (worker.isCancelled()) {
            System.out.println("Task has been cancelled");
        } else {
            System.out.println("Task has not been cancelled");
        }
    }
}
