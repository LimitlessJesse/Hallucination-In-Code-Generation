import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_46 {
    public static void main(String[] args) {
        try {
            Path link = Paths.get("/path/to/your/link");
            Path target = Files.readSymbolicLink(link);
            System.out.println("The target of the symbolic link is: " + target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
