import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Naming_1 {
    public static void main(String[] args) {
        try {
            // Create a remote object
            Hello hello = new HelloImpl();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(hello, 0);

            // Start the registry
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object
            Naming.bind("//localhost:1099/Hello", stub);

            System.out.println("Hello bound to registry");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}

interface Hello extends java.rmi.Remote {
    String sayHello() throws RemoteException;
}

class HelloImpl implements Hello {
    public String sayHello() {
        return "Hello, world!";
    }
}
