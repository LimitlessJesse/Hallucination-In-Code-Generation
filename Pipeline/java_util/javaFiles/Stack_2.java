import java.util.Stack;

public class Stack_2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.peek());  // Output: World
    }
}
