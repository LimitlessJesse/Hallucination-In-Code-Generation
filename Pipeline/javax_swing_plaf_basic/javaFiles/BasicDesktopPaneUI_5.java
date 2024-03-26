import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicDesktopPaneUI;

public class BasicDesktopPaneUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicDesktopPaneUI ui = new BasicDesktopPaneUI();
        ui.installUI(component);
    }
}
