import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileFilter_1 {
    public static void main(String[] args) {
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }

                String name = f.getName().toLowerCase();

                return name.endsWith(".txt") || name.endsWith(".doc");
            }

            @Override
            public String getDescription() {
                return "Text and Document files";
            }
        };

        File file = new File("test.txt");
        System.out.println(fileFilter.accept(file));
    }
}
