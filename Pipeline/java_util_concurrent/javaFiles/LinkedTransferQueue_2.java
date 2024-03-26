import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_2 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Hello");
        String element = queue.poll();
        System.out.println(element);
    }
}
