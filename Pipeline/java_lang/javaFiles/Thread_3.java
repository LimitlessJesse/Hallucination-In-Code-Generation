import java.lang.Thread;

public class Thread_3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running...");
                Thread.yield();
            }
        });

        thread.start();
    }
}
