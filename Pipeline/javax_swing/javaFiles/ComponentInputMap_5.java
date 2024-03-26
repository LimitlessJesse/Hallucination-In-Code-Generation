import javax.swing.ComponentInputMap;
import javax.swing.JButton;

public class ComponentInputMap_5 {
    public static void main(String[] args) {
        ComponentInputMap map = new ComponentInputMap();
        JButton button = new JButton("Click me");
        map.put(button, "click");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
