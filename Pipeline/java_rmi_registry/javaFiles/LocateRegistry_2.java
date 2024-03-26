import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LocateRegistry_2 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Registry created successfully at port 1099");
        } catch (Exception e) {
            System.out.println("Failed to create Registry: " + e.getMessage());
        }
    }
}
