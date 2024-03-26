import java.util.PropertyPermission;

public class PropertyPermission_4 {
    public static void main(String[] args) {
        PropertyPermission permission = new PropertyPermission("java.version", "read");
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
