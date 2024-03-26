import java.security.cert.PKIXBuilderParameters;

public class PKIXBuilderParameters_5 {
    public static void main(String[] args) {
        PKIXBuilderParameters pkixBuilderParameters = new PKIXBuilderParameters();
        pkixBuilderParameters.setMaxPathLength(10);
    }
}
