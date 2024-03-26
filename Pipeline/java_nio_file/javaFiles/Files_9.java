import java.nio.file.*;

public class Files_9 {
    public static void main(String[] args) {
        try {
            // Create a byte array
            byte[] bytes = "Hello, World!".getBytes();

            // Create a Path object
            Path path = Paths.get("example.txt");

            // Write the byte array to the file
            Files.write(path, bytes);

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
