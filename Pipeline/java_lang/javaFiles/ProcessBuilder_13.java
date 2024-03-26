import java.io.IOException;

public class ProcessBuilder_13 {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("ls", "-l");
            builder.redirectErrorStream(true);
            Process process = builder.start();
            process.waitFor();
            System.out.println("Process exit value: " + process.exitValue());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
