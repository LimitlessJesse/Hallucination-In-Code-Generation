import java.security.BasicPermission;

public class BasicPermission_3 {
    public static void main(String[] args) {
        BasicPermission permission = new BasicPermission("test");
        String[] actions = permission.getActions();
        for (String action : actions) {
            System.out.println(action);
        }
    }
}
