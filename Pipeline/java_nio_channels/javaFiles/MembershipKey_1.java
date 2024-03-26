import java.nio.channels.MembershipKey;
import java.nio.channels.MulticastChannel;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;

public class MembershipKey_1 {
    public static void main(String[] args) throws Exception {
        // Create a multicast channel
        MulticastChannel channel = MulticastChannel.open();

        // Bind the channel to a local address
        channel.bind(new InetSocketAddress("localhost", 0));

        // Get the network interface
        NetworkInterface networkInterface = NetworkInterface.getByName("eth0");

        // Join the multicast group
        MembershipKey membershipKey = channel.join(new InetSocketAddress("224.0.0.1", 5007), networkInterface);

        // Check if the membership key is still valid
        boolean isValid = membershipKey.isValid();

        System.out.println("Membership key is valid: " + isValid);

        // Leave the multicast group
        channel.leave(membershipKey);

        // Check if the membership key is still valid after leaving the group
        isValid = membershipKey.isValid();

        System.out.println("Membership key is valid after leaving the group: " + isValid);

        // Close the channel
        channel.close();
    }
}
