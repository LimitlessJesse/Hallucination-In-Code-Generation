import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialog_3 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select Directory", FileDialog.LOAD);
        fileDialog.setDirectory(".");
        fileDialog.setVisible(true);

        String directory = fileDialog.getDirectory();
        System.out.println("Selected Directory: " + directory);
    }
}
