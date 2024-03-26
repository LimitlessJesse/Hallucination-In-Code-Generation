import javax.swing.*;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import java.awt.*;
import java.lang.reflect.Method;

public class BasicPopupMenuSeparatorUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                BasicPopupMenuSeparatorUI ui = new BasicPopupMenuSeparatorUI();
                try {
                    Method method = BasicPopupMenuSeparatorUI.class.getDeclaredMethod("paint", Graphics.class, JComponent.class);
                    method.setAccessible(true);
                    method.invoke(ui, g, this);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        component.setPreferredSize(new Dimension(100, 100));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(component);
        frame.pack();
        frame.setVisible(true);
    }
}
