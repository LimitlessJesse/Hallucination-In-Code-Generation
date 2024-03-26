import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListSelectionEvent_4 {
    public static void main(String[] args) {
        JList<String> list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3"});

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int firstIndex = e.getFirstIndex();
                    System.out.println("First selected index: " + firstIndex);
                }
            }
        });
    }
}
