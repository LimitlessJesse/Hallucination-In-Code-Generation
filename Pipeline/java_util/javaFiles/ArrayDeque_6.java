import java.util.ArrayDeque;

public class ArrayDeque_6 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        System.out.println("Before poll: " + deque);

        String head = deque.poll();

        System.out.println("After poll: " + deque);
        System.out.println("Head: " + head);
    }
}
