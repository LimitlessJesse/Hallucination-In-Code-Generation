import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class X509CertSelector_3 {
    public static void main(String[] args) {
        try {
            // Create a CertificateFactory instance
            CertificateFactory cf = CertificateFactory.getInstance("X.509");

            // Create a FileInputStream instance
            FileInputStream fis = new FileInputStream("path_to_your_certificate_file");

            // Create a X509Certificate instance
            X509Certificate cert = (X509Certificate) cf.generateCertificate(fis);

            // Create a X509CertSelector instance
            X509CertSelector selector = new X509CertSelector();

            // Get the certificate from the selector
            X509Certificate certificate = selector.getCertificate(cert);

            // Print the certificate
            System.out.println(certificate);

        } catch (CertificateException | IOException e) {
            e.printStackTrace();
        }
    }
}
