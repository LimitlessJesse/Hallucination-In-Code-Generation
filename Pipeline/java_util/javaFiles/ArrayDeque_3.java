import java.util.ArrayDeque;

public class ArrayDeque_3 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offerFirst("Hello");
        System.out.println(deque);
    }
}
