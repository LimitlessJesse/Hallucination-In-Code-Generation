import java.util.concurrent.Phaser;

public class Phaser_4 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);

        new Thread(() -> {
            System.out.println("Thread 1 is registered");
            phaser.arriveAndDeregister();
            System.out.println("Thread 1 is deregistered");
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2 is registered");
            phaser.arriveAndDeregister();
            System.out.println("Thread 2 is deregistered");
        }).start();

        phaser.arriveAndAwaitAdvance();
        System.out.println("All threads have arrived");
    }
}
