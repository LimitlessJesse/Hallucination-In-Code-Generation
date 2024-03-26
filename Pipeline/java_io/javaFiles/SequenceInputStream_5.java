import java.io.*;

public class SequenceInputStream_5 {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        InputStream input1 = new ByteArrayInputStream("Hello".getBytes());
        InputStream input2 = new ByteArrayInputStream("World".getBytes());
        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);
        try {
            int count;
            while ((count = sequenceInputStream.read(buffer, 0, buffer.length))!= -1) {
                System.out.println(new String(buffer, 0, count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                sequenceInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
