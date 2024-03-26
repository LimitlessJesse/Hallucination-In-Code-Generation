import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;

public class LineNumberInputStream_5 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] byteArray = data.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(byteArrayInputStream);

        byte[] buffer = new byte[1024];
        int bytesRead;
        try {
            while ((bytesRead = lineNumberInputStream.read(buffer, 0, buffer.length))!= -1) {
                System.out.println("Bytes read: " + bytesRead);
                System.out.println("Line number: " + lineNumberInputStream.getLineNumber());
                System.out.println("Data: " + new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
