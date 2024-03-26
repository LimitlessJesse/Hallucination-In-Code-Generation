import java.security.cert.X509CRL;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class X509CRL_2 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509CRL crl = (X509CRL) cf.generateCRL(new FileInputStream("path_to_your_crl_file"));
            Date nextUpdate = crl.getNextUpdate();
            System.out.println("Next Update: " + nextUpdate);
        } catch (CertificateException | IOException e) {
            e.printStackTrace();
        }
    }
}
