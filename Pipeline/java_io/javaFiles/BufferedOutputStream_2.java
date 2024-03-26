import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_2 {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            bos.write('H');
            bos.write('e');
            bos.write('l');
            bos.write('l');
            bos.write('o');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
