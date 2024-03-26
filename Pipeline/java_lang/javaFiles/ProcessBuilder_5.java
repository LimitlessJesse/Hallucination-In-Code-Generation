import java.io.File;
import java.io.IOException;

public class ProcessBuilder_5 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dir");
        File file = new File("C:\\path\\to\\your\\file.txt");
        pb.redirectInput(file);

        try {
            Process process = pb.start();
            // Handle the process output here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
