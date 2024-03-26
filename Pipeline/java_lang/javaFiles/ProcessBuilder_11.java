import java.io.File;
import java.io.IOException;

public class ProcessBuilder_11 {
    public static void main(String[] args) {
        File dir = new File("/path/to/your/directory");
        ProcessBuilder pb = new ProcessBuilder();
        pb.directory(dir);
        try {
            Process process = pb.start();
            System.out.println("Process started with ID: " + process.pid());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
