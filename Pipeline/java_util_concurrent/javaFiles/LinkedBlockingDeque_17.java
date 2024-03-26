import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_17 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");

        System.out.println(deque.contains("Hello"));  // Outputs: true
        System.out.println(deque.contains("Java"));  // Outputs: false
    }
}
