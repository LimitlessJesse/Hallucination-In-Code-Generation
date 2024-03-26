import java.security.*;

public class CodeSource_5 {
    public static void main(String[] args) {
        try {
            Permission permission = new Permission("test.permission");
            CodeSource codeSource = new CodeSource(new File("test.jar"), (java.util.jar.Manifest) null);
            System.out.println(permission.implies(codeSource));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
