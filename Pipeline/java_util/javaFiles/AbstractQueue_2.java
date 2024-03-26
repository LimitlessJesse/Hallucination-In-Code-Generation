import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

public class AbstractQueue_2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println("Queue before remove: " + queue);
        queue.remove();
        System.out.println("Queue after remove: " + queue);
    }
}
