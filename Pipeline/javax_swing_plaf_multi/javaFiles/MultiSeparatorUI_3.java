import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;

public class MultiSeparatorUI_3 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        MultiSeparatorUI multiSeparatorUI = new MultiSeparatorUI();
        multiSeparatorUI.uninstallUI(separator);
    }
}
