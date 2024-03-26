import java.lang.ThreadGroup;

public class ThreadGroup_5 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup") {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Thread " + t.getName() + " threw an exception: " + e.getMessage());
            }
        };

        Thread thread = new Thread(group, () -> {
            throw new RuntimeException("Uncaught exception");
        });

        thread.start();
    }
}
