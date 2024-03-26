import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String s = "Hello, World!";
            byte[] bytes = s.getBytes();

            bufferedOutputStream.write(bytes);

            // Flush the stream
            bufferedOutputStream.flush();

            bufferedOutputStream.close();
            fileOutputStream.close();

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
