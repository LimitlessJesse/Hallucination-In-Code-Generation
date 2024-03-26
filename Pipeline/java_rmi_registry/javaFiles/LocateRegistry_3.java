import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LocateRegistry_3 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            System.out.println("Registry found on port 1099");
        } catch (Exception e) {
            System.out.println("Registry not found on port 1099");
        }
    }
}
