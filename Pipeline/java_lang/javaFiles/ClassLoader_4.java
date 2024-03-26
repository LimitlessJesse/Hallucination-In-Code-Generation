import java.net.URL;

public class ClassLoader_4 {
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        URL url = classLoader.getResource("file.txt");
        System.out.println(url);
    }
}
