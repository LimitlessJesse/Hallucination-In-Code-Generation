import java.io.IOException;
import java.util.Arrays;

public class ProcessBuilder_12 {
    public static void main(String[] args) {
        ProcessBuilder builder = new ProcessBuilder(
                "ls", "-l");
        builder.redirectErrorStream(true);
        try {
            Process process = builder.start();
            System.out.println("Process started: " + process);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
