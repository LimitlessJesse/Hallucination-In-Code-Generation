import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_1 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        boolean result = queue.add("Hello");
        System.out.println(result); // Output: true
    }
}
