import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_5 {
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        try {
            while (true) {
                if (br.ready()) {
                    String line = br.readLine();
                    if (line.equals("exit")) {
                        break;
                    }
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
