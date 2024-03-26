import javax.activation.FileTypeMap;

public class FileTypeMap_3 {
    public static void main(String[] args) {
        FileTypeMap fileTypeMap = FileTypeMap.getDefaultFileTypeMap();
        String contentType = fileTypeMap.getContentType("example.txt");
        System.out.println(contentType);
    }
}
