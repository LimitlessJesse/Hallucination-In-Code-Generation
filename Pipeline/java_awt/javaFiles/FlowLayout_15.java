import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Frame;

public class FlowLayout_15 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FlowLayout flowLayout = new FlowLayout();
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        flowLayout.addLayoutComponent("Button 1", button1);
        flowLayout.addLayoutComponent("Button 2", button2);

        frame.setLayout(flowLayout);
        frame.add(button1);
        frame.add(button2);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
