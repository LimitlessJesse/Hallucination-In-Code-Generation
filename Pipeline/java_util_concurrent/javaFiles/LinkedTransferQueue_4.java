import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_4 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Hello");
        System.out.println(queue.hasWaitingConsumer());
    }
}
