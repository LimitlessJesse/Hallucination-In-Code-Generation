import java.util.Stack;

public class Stack_5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");

        String searchElement = "Java";
        int position = stack.search(searchElement);

        if(position == -1) {
            System.out.println(searchElement + " not found in the stack");
        } else {
            System.out.println(searchElement + " found at position " + position + " from the top of the stack");
        }
    }
}
