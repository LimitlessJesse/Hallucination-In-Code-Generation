import java.io.FileDescriptor;
import java.io.IOException;

public class FileDescriptor_3 {
    public static void main(String[] args) {
        FileDescriptor fd = new FileDescriptor();
        try {
            fd.sync();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
