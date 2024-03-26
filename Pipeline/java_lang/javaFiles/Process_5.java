import java.io.IOException;

public class Process_5 {
    public static void main(String[] args) {
        try {
            ProcessHandle processHandle = ProcessHandle.of(ProcessHandle.current().pid()).get();
            processHandle.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
