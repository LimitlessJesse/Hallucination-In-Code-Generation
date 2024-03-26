import java.awt.Component;
import java.awt.Container;

public class Component_2 {
    public static void main(String[] args) {
        Container container = new Container();
        Component component = new Component() {
            @Override
            public void removeNotify() {
                System.out.println("Component removed from the screen.");
            }
        };
        container.add(component);
        container.remove(component);
    }
}
