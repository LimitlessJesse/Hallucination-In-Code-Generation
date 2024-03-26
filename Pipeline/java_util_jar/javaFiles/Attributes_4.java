import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.jar.JarFile;
import java.io.File;

public class Attributes_4 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile(new File("path_to_your_jar_file.jar"));
            Manifest manifest = jarFile.getManifest();
            Attributes attributes = manifest.getMainAttributes();
            int size = attributes.size();
            System.out.println("Number of attributes in the jar file: " + size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
