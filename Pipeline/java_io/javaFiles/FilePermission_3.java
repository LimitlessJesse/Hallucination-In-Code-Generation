import java.io.FilePermission;

public class FilePermission_3 {
    public static void main(String[] args) {
        FilePermission permission1 = new FilePermission("<<ALL FILES>>", "read,write");
        FilePermission permission2 = new FilePermission("<<ALL FILES>>", "read,write");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the permissions equal? " + isEqual);
    }
}
