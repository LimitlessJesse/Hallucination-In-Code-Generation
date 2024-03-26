import java.io.File;
import java.io.IOException;

public class File_3 {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
