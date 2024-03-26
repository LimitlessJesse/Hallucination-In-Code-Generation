import java.security.CodeSource;
import java.net.URL;
import java.security.cert.Certificate;

public class CodeSource_4 {
    public static void main(String[] args) {
        try {
            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
            if (codeSource!= null) {
                URL location = codeSource.getLocation();
                Certificate[] certificates = codeSource.getCertificates();
                System.out.println("CodeSource: " + codeSource);
                System.out.println("Location: " + location);
                System.out.println("Certificates: " + certificates);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
