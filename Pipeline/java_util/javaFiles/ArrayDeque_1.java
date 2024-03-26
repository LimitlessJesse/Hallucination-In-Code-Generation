import java.util.ArrayDeque;

public class ArrayDeque_1 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        boolean result = deque.add("Hello");
        System.out.println(result);
        System.out.println(deque);
    }
}
