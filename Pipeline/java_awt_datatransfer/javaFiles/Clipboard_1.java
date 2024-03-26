import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class Clipboard_1 {
    public static void main(String[] args) {
        StringSelection stringSelection = new StringSelection("Hello World");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}
