import java.io.Console;

public class Console_3 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console!= null) {
            String name = console.readLine("Enter your name: ");
            console.printf("Hello, %s!%n", name);
        } else {
            System.out.println("Console is not available.");
        }
    }
}
