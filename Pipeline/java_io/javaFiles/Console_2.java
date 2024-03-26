import java.io.Console;

public class Console_2 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console!= null) {
            char[] password = console.readPassword("Enter your password: ");
            System.out.println("You entered: " + new String(password));
        } else {
            System.out.println("Console is not available");
        }
    }
}
