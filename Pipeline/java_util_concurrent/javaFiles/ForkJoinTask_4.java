import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_4 {
    public static void main(String[] args) {
        ForkJoinTask<Void> task = new ForkJoinTask<Void>() {
            @Override
            public Void getRawResult() {
                return null;
            }

            @Override
            protected void setRawResult(Void value) {
            }

            @Override
            protected boolean exec() {
                return false;
            }
        };

        // Cancel the task
        task.cancel(true);

        // Check if the task is cancelled
        boolean isCancelled = task.isCancelled();

        System.out.println("Is task cancelled? " + isCancelled);
    }
}
