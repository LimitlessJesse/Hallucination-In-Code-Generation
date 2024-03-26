import javax.swing.event.ListSelectionEvent;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.event.ItemEvent;

public class ListSelectionEvent_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Selection Event Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> list = new JList<>(items);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int lastIndex = e.getLastIndex();
                    System.out.println("Last index selected: " + lastIndex);
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
