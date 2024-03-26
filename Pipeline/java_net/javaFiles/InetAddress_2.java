import java.net.InetAddress;

public class InetAddress_2 {
    public static void main(String[] args) {
        try {
            InetAddress myAddress = InetAddress.getLocalHost();
            System.out.println("My IP Address is: " + myAddress.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
