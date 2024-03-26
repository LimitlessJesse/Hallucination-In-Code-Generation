import java.io.FilePermission;

public class FilePermission_4 {
    public static void main(String[] args) {
        FilePermission filePermission = new FilePermission("<<ALL FILES>>", "read");
        int hashCode = filePermission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
