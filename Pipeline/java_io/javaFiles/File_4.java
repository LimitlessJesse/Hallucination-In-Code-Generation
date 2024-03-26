import java.io.File;

public class File_4 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
