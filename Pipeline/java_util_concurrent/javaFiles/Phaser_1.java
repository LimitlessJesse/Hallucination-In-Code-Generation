import java.util.concurrent.Phaser;

public class Phaser_1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int id = phaser.register();
        System.out.println("Registered id: " + id);
    }
}
