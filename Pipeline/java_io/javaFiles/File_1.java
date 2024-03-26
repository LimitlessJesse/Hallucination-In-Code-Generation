import java.io.File;
import java.io.IOException;

public class File_1 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (file.canRead()) {
            System.out.println("The file can be read.");
        } else {
            System.out.println("The file cannot be read.");
        }
    }
}
