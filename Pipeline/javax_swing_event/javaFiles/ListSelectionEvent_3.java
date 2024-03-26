import javax.swing.*;
import javax.swing.event.*;

public class ListSelectionEvent_3 {
    public static void main(String[] args) {
        JList<String> list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3"});
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                boolean isAdjusting = e.getValueIsAdjusting();
                System.out.println("Is Adjusting: " + isAdjusting);
            }
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(list));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
