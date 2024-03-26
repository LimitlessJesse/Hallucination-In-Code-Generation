import java.rmi.Naming;

public class Naming_2 {
    public static void main(String[] args) {
        try {
            // Assuming that the name is already bound
            Naming.unbind("//localhost:1099/MyService");
            System.out.println("Unbound successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
