import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader_4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                if (reader.ready()) {
                    String line = reader.readLine();
                    if (line.equals("exit")) {
                        break;
                    }
                    System.out.println("You entered: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
