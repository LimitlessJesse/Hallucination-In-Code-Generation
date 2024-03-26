import java.security.cert.CRL;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CRLException;
import java.security.cert.CRLReason;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class CRL_1 {
    public static void main(String[] args) {
        try {
            // Load CRL
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream in = new FileInputStream("crl.pem");
            CRL crl = cf.generateCRL(in);

            // Load Certificate
            CertificateFactory cf2 = CertificateFactory.getInstance("X.509");
            InputStream in2 = new FileInputStream("cert.pem");
            Certificate cert = cf2.generateCertificate(in2);

            // Check if certificate is revoked
            boolean isRevoked = crl.isRevoked((X509Certificate) cert);

            System.out.println("Is certificate revoked? " + isRevoked);

            in.close();
            in2.close();
        } catch (CertificateException | IOException | CRLException e) {
            e.printStackTrace();
        }
    }
}
