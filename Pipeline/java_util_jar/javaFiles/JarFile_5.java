import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.IOException;

public class JarFile_5 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("path_to_your_jar_file");
            JarEntry jarEntry = jarFile.getJarEntry("name_of_the_entry_in_jar_file");
            System.out.println(jarEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
