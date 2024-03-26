import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialog_2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "File Dialog", FileDialog.LOAD);
        fileDialog.setDirectory("C:\\"); // Set the directory to C:\
        fileDialog.setVisible(true);
    }
}
