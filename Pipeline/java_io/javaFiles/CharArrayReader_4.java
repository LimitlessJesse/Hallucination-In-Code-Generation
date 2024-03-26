import java.io.CharArrayReader;

public class CharArrayReader_4 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c'};
        CharArrayReader reader = new CharArrayReader(array);

        System.out.println("Is there any data available? " + reader.ready());

        // Read data from the stream
        int data;
        while ((data = reader.read())!= -1) {
            System.out.print((char) data);
        }

        System.out.println("\nIs there any data available? " + reader.ready());
    }
}
