import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_1 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean result = deque.add("Hello");
        System.out.println("Add operation was successful: " + result);
    }
}
