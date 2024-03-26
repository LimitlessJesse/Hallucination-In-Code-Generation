import java.io.InputStream;

public class ClassLoader_5 {
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("file.txt");

        if (inputStream!= null) {
            // Read the file
        } else {
            System.out.println("File not found");
        }
    }
}
