import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class BasicScrollBarUI_1 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        BasicScrollBarUI scrollBarUI = new BasicScrollBarUI() {
            @Override
            protected void setThumbBounds(int x, int y, int w, int h) {
                super.setThumbBounds(x, y, w, h);
            }
        };
        scrollBar.setUI(scrollBarUI);
    }
}
