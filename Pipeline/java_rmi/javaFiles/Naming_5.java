import java.rmi.Naming;
import java.rmi.RemoteException;

public class Naming_5 {
    public static void main(String[] args) {
        try {
            // Replace "rmi://localhost:1099/MyRemoteObject" with the actual RMI URL
            MyRemoteObject obj = (MyRemoteObject) Naming.lookup("rmi://localhost:1099/MyRemoteObject");
            // Now you can use the object as needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
