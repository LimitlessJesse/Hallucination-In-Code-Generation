import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Button;

public class FlowLayout_16 {
    public static void main(String[] args) {
        Container container = new Container();
        FlowLayout flowLayout = new FlowLayout();
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        container.add(button1);
        container.add(button2);

        flowLayout.layoutContainer(container);
    }
}
