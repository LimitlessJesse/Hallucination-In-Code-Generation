import java.util.PropertyPermission;

public class PropertyPermission_2 {
    public static void main(String[] args) {
        PropertyPermission permission1 = new PropertyPermission("java.util.PropertyPermission", "read");
        PropertyPermission permission2 = new PropertyPermission("java.util.PropertyPermission", "read");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
