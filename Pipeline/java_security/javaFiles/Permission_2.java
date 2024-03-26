import java.security.Permission;

public class Permission_2 {
    public static void main(String[] args) {
        Permission permission1 = new Permission("permission1");
        Permission permission2 = new Permission("permission2");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
