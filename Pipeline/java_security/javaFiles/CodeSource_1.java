import java.net.URL;
import java.security.CodeSource;

public class CodeSource_1 {
    public static void main(String[] args) {
        try {
            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
            if (codeSource!= null) {
                URL location = codeSource.getLocation();
                System.out.println("Location: " + location);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
