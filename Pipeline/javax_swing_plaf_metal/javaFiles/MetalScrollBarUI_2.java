import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;

public class MetalScrollBarUI_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        MetalScrollBarUI scrollBarUI = new MetalScrollBarUI();
        scrollBarUI.paintThumb(scrollBar.getGraphics(), scrollBar, scrollBar.getThumbBounds());
    }
}
