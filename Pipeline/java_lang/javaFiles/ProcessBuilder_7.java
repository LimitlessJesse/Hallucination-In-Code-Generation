import java.io.File;
import java.io.IOException;

public class ProcessBuilder_7 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir");
        File outputFile = new File("output.txt");
        pb.redirectOutput(outputFile);
        try {
            Process p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
