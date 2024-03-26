import java.awt.Dimension;
import java.awt.Component;

public class Dimension_4 {
    public static void main(String[] args) {
        Component component = new Component() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100);
            }
        };

        Dimension newSize = new Dimension(200, 200);
        component.setSize(newSize);

        System.out.println("New width: " + component.getSize().width);
        System.out.println("New height: " + component.getSize().height);
    }
}
