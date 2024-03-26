import java.nio.file.*;
import java.nio.file.attribute.*;

public class Files_19 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("path_to_file");
        UserPrincipal owner = new UserPrincipal() {
            @Override
            public String getName() {
                return "new_owner";
            }
        };
        Files.setOwner(path, owner);
    }
}
