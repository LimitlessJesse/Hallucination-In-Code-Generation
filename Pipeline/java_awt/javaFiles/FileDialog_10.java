import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialog_10 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String file = fileDialog.getFile();
        System.out.println("Selected file: " + file);
    }
}
