import javax.management.remote.rmi.RMIConnectorServer;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class RMIConnectorServer_4 {
    public static void main(String[] args) throws Exception {
        RMIServerSocketFactory ssFactory = null;
        RMISocketFactory sFactory = null;
        RMIConnectorServer rmiConnectorServer = new RMIConnectorServer(ssFactory, sFactory);
        UnicastRemoteObject.exportObject(rmiConnectorServer, 0);
        rmiConnectorServer.start();
        rmiConnectorServer.stop();
    }
}
