import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_4 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean result = deque.offerLast("Hello");
        System.out.println("Element added: " + result);
    }
}
