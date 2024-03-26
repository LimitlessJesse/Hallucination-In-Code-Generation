import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.IOException;

public class MemoryCacheImageInputStream_2 {
    public static void main(String[] args) {
        try {
            MemoryCacheImageInputStream inputStream = new MemoryCacheImageInputStream();
            int data = inputStream.read();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
