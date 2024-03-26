import java.util.zip.Inflater;

public class Inflater_5 {
    public static void main(String[] args) {
        byte[] input = new byte[1024];
        byte[] output = new byte[1024];

        Inflater inflater = new Inflater();
        inflater.setInput(input);

        int result = inflater.inflate(output);
        System.out.println("Inflated: " + result);

        inflater.end();
    }
}
