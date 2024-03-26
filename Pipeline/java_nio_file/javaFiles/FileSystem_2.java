import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

public class FileSystem_2 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        PathMatcher matcher = fs.getPathMatcher("glob:*.{java,class}");
        System.out.println(matcher.matches(fs.getPath("Main.java")));
        System.out.println(matcher.matches(fs.getPath("Main.class")));
        System.out.println(matcher.matches(fs.getPath("Main.txt")));
    }
}
