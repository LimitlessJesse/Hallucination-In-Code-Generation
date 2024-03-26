import javax.activation.FileTypeMap;

public class FileTypeMap_5 {
    public static void main(String[] args) {
        FileTypeMap map = FileTypeMap.getDefaultFileTypeMap();
        map.addExtension("txt", "text/plain");
        FileTypeMap.setDefaultFileTypeMap(map);
    }
}
