import javax.management.MBeanServerPermission;

public class MBeanServerPermission_3 {
    public static void main(String[] args) {
        MBeanServerPermission permission1 = new MBeanServerPermission("permission1", "actions");
        MBeanServerPermission permission2 = new MBeanServerPermission("permission1", "actions");
        MBeanServerPermission permission3 = new MBeanServerPermission("permission2", "actions");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
