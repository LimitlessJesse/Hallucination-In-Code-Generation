import java.io.DataInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class DataInputStream_4 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        byte[] bytes = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);

        try {
            String readStr = dataInputStream.readUTF();
            System.out.println("Read string: " + readStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
