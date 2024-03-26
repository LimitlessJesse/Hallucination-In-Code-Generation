import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.util.Enumeration;
import java.io.IOException;

public class JarFile_2 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("path_to_your_jar_file");
            Enumeration<JarEntry> entries = jarFile.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                System.out.println(entry.getName());
            }

            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
