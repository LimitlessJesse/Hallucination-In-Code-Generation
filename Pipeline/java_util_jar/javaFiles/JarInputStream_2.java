import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class JarInputStream_2 {
    public static void main(String[] args) {
        try {
            JarInputStream jarInputStream = new JarInputStream(new FileInputStream("path_to_your_jar_file.jar"));
            JarEntry jarEntry = jarInputStream.getNextJarEntry();
            while (jarEntry!= null) {
                System.out.println(jarEntry.getName());
                jarEntry = jarInputStream.getNextJarEntry();
            }
            jarInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
