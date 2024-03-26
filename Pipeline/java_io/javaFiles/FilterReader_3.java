import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class FilterReader_3 {
    public static void main(String[] args) {
        try {
            FilterReader reader = new FilterReader(new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    return 0;
                }

                @Override
                public void close() throws IOException {
                }
            }) {
                @Override
                public long skip(long n) throws IOException {
                    return super.skip(n);
                }
            };

            // Call the skip method
            long skipped = reader.skip(10);
            System.out.println("Skipped " + skipped + " characters");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
