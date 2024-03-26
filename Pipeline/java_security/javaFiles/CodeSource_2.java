import java.security.CodeSource;
import java.security.Permission;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.jar.JarFile;

public class CodeSource_2 {
    public static void main(String[] args) throws Exception {
        // Create two CodeSource objects
        CodeSource codeSource1 = new CodeSource(new JarFile("file1.jar"), (Certificate[]) null);
        CodeSource codeSource2 = new CodeSource(new JarFile("file2.jar"), (Certificate[]) null);

        // Compare the two CodeSource objects
        boolean isEqual = codeSource1.equals(codeSource2);

        // Print the result
        System.out.println("Are the CodeSource objects equal? " + isEqual);
    }
}
