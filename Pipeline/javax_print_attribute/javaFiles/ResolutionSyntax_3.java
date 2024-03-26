import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_3 {
    public static void main(String[] args) {
        ResolutionSyntax resolution1 = new ResolutionSyntax(100, 200);
        ResolutionSyntax resolution2 = new ResolutionSyntax(100, 200);
        ResolutionSyntax resolution3 = new ResolutionSyntax(300, 400);

        System.out.println(resolution1.equals(resolution2)); // true
        System.out.println(resolution1.equals(resolution3)); // false
    }
}
