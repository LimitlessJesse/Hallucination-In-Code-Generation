import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JMenuBar_5 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        menuBar.add(menu1);
        menuBar.add(menu2);

        JMenu menu = menuBar.getMenu(0);
        System.out.println(menu.getText());
    }
}
