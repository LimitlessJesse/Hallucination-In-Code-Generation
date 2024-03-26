import javax.print.attribute.standard.ResolutionSyntax;

public class ResolutionSyntax_4 {
    public static void main(String[] args) {
        ResolutionSyntax resolutionSyntax = new ResolutionSyntax(100, 200);
        int hashCode = resolutionSyntax.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
