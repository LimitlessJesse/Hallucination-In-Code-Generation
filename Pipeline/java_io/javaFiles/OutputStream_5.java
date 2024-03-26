import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            String s = "Hello, World!";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
