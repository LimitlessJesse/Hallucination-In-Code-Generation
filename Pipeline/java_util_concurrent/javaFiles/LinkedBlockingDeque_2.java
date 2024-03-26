import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_2 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean result = deque.offer("Hello");
        System.out.println("Element added: " + result);
    }
}
