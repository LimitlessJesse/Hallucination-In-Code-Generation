import javax.activation.FileTypeMap;
import java.io.File;

public class FileTypeMap_2 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        String contentType = FileTypeMap.getDefaultFileTypeMap().getContentType(file);
        System.out.println("Content type of the file is: " + contentType);
    }
}
