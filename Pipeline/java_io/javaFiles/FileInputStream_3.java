import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            int i;
            while ((i = fileInputStream.read())!= -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
