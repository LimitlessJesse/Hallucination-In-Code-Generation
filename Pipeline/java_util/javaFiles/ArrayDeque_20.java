import java.util.ArrayDeque;

public class ArrayDeque_20 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        Object[] array = deque.toArray();

        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
