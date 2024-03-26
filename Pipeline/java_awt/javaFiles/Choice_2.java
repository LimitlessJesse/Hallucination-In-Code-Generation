import java.awt.*;

public class Choice_2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Choice Example");
        List list = new List(5, true);
        list.addItem("Item 1");
        list.addItem("Item 2");
        list.addItem("Item 3");
        frame.add(list);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
