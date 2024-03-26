import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathChecker;
import java.security.cert.Certificate;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;

public class CertPathValidatorSpi_4 {
    public static void main(String[] args) {
        try {
            // Load the self-signed certificate
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            Certificate cert = cf.generateCertificate(new FileInputStream("selfsigned.cer"));

            // Create a CertPath from the certificate
            CertPath certPath = cf.generateCertPath(new Certificate[]{cert});

            // Create a CertPathValidator
            CertPathValidator validator = CertPathValidator.getInstance("PKIX");

            // Create a CertPathValidatorResult
            CertPathValidatorResult result = validator.validate(certPath, null);

            System.out.println("Validation result: " + result);
        } catch (CertificateException | CertPathValidatorException | IOException e) {
            e.printStackTrace();
        }
    }
}
