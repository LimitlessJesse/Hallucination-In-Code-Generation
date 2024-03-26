import java.security.CodeSource;
import java.security.ProtectionDomain;

public class CodeSource_3 {
    public static void main(String[] args) {
        try {
            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
            if (codeSource!= null) {
                int hashCode = codeSource.hashCode();
                System.out.println("Hash code: " + hashCode);
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
