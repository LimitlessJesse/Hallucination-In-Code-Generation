import java.io.IOException;

public class Process_4 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls");
            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
