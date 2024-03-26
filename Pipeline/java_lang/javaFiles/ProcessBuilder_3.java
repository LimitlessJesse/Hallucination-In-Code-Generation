import java.io.File;
import java.io.IOException;

public class ProcessBuilder_3 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir");
        File errorFile = new File("error.txt");
        pb.redirectError(errorFile);

        try {
            Process process = pb.start();
            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
