import javax.management.MBeanServerPermission;

public class MBeanServerPermission_4 {
    public static void main(String[] args) {
        MBeanServerPermission permission = new MBeanServerPermission("register", "read");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
