import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Label;

public class CardLayout_1 {
    public static void main(String[] args) {
        Container container = new Container();
        CardLayout cardLayout = new CardLayout();
        container.setLayout(cardLayout);

        Component component1 = new Label("Component 1");
        Component component2 = new Label("Component 2");

        cardLayout.addLayoutComponent("Component1", component1);
        cardLayout.addLayoutComponent("Component2", component2);

        container.add(component1, "Component1");
        container.add(component2, "Component2");
    }
}
