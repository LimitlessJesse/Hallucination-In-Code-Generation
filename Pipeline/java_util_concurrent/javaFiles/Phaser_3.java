import java.util.concurrent.Phaser;

public class Phaser_3 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread(() -> {
            System.out.println("Thread 1: Beginning");
            phaser.arriveAndAwaitAdvance();
            System.out.println("Thread 1: End");
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2: Beginning");
            phaser.arriveAndAwaitAdvance();
            System.out.println("Thread 2: End");
        }).start();

        phaser.arriveAndDeregister();
        System.out.println("All threads have completed");
    }
}
