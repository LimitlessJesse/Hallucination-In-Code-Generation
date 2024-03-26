import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_2 {
    public static void main(String[] args) {
        ServicePermission permission1 = new ServicePermission("service1", "connect,listen");
        ServicePermission permission2 = new ServicePermission("service1", "connect,listen");
        ServicePermission permission3 = new ServicePermission("service2", "connect,listen");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
