import java.util.AbstractQueue;
import java.util.LinkedList;

public class AbstractQueue_1 {
    public static void main(String[] args) {
        AbstractQueue<String> queue = new LinkedList<>();
        queue.add("Hello");
        System.out.println(queue);
    }
}
