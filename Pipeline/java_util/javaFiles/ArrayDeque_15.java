import java.util.ArrayDeque;

public class ArrayDeque_15 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        System.out.println(deque.isEmpty()); // true
        deque.add("Hello");
        System.out.println(deque.isEmpty()); // false
    }
}
