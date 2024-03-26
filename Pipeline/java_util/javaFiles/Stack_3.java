import java.util.Stack;

public class Stack_3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack);
        String popped = stack.pop();
        System.out.println("Popped: " + popped);
        System.out.println(stack);
    }
}
