import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_1 {
    public static void main(String[] args) {
        FilterOutputStream outputStream = new FilterOutputStream(System.out) {
            @Override
            public void write(int b) throws IOException {
                super.write(b);
            }
        };

        try {
            outputStream.write('H');
            outputStream.write('i');
            outputStream.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
