import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.net.Socket;

public class SslRMIClientSocketFactory_2 {
    public static void main(String[] args) {
        SslRMIClientSocketFactory sslRMIClientSocketFactory = new SslRMIClientSocketFactory();
        try {
            Socket socket = sslRMIClientSocketFactory.createSocket("www.example.com", 80);
            System.out.println("Socket created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
