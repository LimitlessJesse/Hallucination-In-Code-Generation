import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_3 {
    public static void main(String[] args) {
        ForkJoinTask<Void> task = new ForkJoinTask<Void>() {
            @Override
            public Void getRawResult() {
                return null;
            }

            @Override
            protected void setRawResult(Void value) {
                // Implementation here
            }

            @Override
            protected boolean exec() {
                return false;
            }
        };

        task.setRawResult(null);
    }
}
