import java.io.*;

public class SequenceInputStream_4 {
    public static void main(String[] args) {
        try {
            InputStream input1 = new ByteArrayInputStream("Hello".getBytes());
            InputStream input2 = new ByteArrayInputStream("World".getBytes());

            SequenceInputStream sis = new SequenceInputStream(input1, input2);

            int i;
            while ((i = sis.read())!= -1) {
                System.out.print((char) i);
            }

            sis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
