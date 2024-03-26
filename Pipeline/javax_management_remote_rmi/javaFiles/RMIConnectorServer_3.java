import javax.management.remote.rmi.RMIConnectorServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIConnectorServer_3 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            RMIConnectorServer rmiConnectorServer = new RMIConnectorServer();
            rmiConnectorServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
