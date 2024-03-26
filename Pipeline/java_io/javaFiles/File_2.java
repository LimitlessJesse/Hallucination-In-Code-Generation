import java.io.File;

public class File_2 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        boolean canWrite = file.canWrite();
        System.out.println("Can write: " + canWrite);
    }
}
