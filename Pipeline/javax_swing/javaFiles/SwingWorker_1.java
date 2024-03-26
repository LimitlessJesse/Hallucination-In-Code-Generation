import javax.swing.SwingWorker;

public class SwingWorker_1 {
    public static void main(String[] args) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Your task goes here
                return null;
            }
        };

        worker.execute();
    }
}
