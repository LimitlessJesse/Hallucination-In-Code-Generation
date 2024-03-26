import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_4 {
    public static void main(String[] args) {
        ServicePermission servicePermission = new ServicePermission("service/host@REALM", "connect,getAttr");
        String[] actions = servicePermission.getActions();
        for (String action : actions) {
            System.out.println(action);
        }
    }
}
