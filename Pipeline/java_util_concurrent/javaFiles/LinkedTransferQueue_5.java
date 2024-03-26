import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_5 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.size()); // Output: 2
    }
}
