import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuItem_5 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");

        // Add menu items to the menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        // Add the menu to the menu bar
        menuBar.add(fileMenu);

        // Disable the "Save" menu item
        saveItem.setEnabled(false);
    }
}
