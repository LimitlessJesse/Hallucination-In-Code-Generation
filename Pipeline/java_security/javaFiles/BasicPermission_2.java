import java.security.BasicPermission;

public class BasicPermission_2 {
    public static void main(String[] args) {
        BasicPermission permission1 = new BasicPermission("permission1");
        BasicPermission permission2 = new BasicPermission("permission2");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
