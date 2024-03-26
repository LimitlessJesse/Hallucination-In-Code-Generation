import javax.swing.*;
import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import java.awt.*;

public class BasicToolBarSeparatorUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 20);
            }
        };

        BasicToolBarSeparatorUI ui = new BasicToolBarSeparatorUI();
        Dimension preferredSize = ui.getPreferredSize(component);

        System.out.println("Preferred width: " + preferredSize.width);
        System.out.println("Preferred height: " + preferredSize.height);
    }
}
