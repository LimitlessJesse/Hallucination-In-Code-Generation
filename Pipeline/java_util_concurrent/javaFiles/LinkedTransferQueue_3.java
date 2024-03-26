import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_3 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Hello");
        System.out.println(queue.tryTransfer("World"));
    }
}
