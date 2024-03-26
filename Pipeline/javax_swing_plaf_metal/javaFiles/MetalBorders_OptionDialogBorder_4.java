import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_OptionDialogBorder_4 {
    public static void main(String[] args) {
        // Create a new OptionDialogBorder
        OptionDialogBorder border = new OptionDialogBorder();

        // Create a new Component
        Component component = new Component() {
            // Override the paint method
            @Override
            public void paint(Graphics g) {
                // Call the paintBorder method
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };

        // Paint the component
        component.paint(component.getGraphics());
    }
}
