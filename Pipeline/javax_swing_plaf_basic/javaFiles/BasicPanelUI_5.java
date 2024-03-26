import javax.swing.*;
import javax.swing.plaf.basic.BasicPanelUI;

public class BasicPanelUI_5 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        BasicPanelUI basicPanelUI = new BasicPanelUI();
        basicPanelUI.installUI(panel);
    }
}
