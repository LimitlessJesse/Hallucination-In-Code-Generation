import javax.security.auth.callback.PasswordCallback;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordCallback_2 {
    public static void main(String[] args) {
        PasswordCallback callback = new PasswordCallback("Enter password", false);
        System.out.println(new String(callback.getPassword()));
    }
}

class PasswordCallback {
    private char[] password;

    public PasswordCallback(String prompt, boolean echoOn) {
        System.out.print(prompt + ": ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (line!= null) {
            password = line.toCharArray();
        }
    }

    public char[] getPassword() {
        return password;
    }
}
