import javax.swing.SwingWorker;

public class SwingWorker_4 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Your task here
                return null;
            }
        };

        worker.execute();

        while (!worker.isDone()) {
            // Wait until the task is done
        }

        System.out.println("Task is done!");
    }
}
