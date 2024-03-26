import java.io.IOException;

public class ProcessBuilder_15 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("ls", "-l");
        pb.inheritIO();
        try {
            Process p = pb.start();
            p.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
