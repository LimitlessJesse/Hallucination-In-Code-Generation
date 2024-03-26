import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class JarFile_3 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("path_to_your_jar_file.jar");
            Manifest manifest = jarFile.getManifest();
            System.out.println(manifest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
