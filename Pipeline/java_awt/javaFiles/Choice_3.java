import java.awt.*;
import java.awt.event.*;

public class Choice_3 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Selected: " + e.getItem());
                }
            }
        });

        // Add the choice to a frame and make it visible
        JFrame frame = new JFrame();
        frame.getContentPane().add(choice);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
