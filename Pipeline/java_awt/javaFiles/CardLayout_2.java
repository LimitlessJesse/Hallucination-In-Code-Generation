import java.awt.CardLayout;
import java.awt.Component;

public class CardLayout_2 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Component component = new Component();
        Object constraints = new Object();
        cardLayout.addLayoutComponent(component, constraints);
    }
}
