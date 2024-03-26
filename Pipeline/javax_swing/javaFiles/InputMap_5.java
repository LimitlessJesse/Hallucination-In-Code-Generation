import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class InputMap_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        InputMap inputMap = component.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("ctrl A"), "selectAll");
        System.out.println(inputMap);

        inputMap.clear();
        System.out.println(inputMap);
    }
}
