import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class ListDataEvent_3 {
    public static void main(String[] args) {
        ListDataListener listener = new ListDataListener() {
            @Override
            public void intervalAdded(ListDataEvent e) {
                System.out.println("Interval added: " + e.getIndex0() + " - " + e.getIndex1());
            }

            @Override
            public void intervalRemoved(ListDataEvent e) {
                System.out.println("Interval removed: " + e.getIndex0() + " - " + e.getIndex1());
            }

            @Override
            public void contentsChanged(ListDataEvent e) {
                System.out.println("Contents changed: " + e.getIndex0() + " - " + e.getIndex1());
            }
        };

        ListDataEvent event = new ListDataEvent(null, ListDataEvent.CONTENTS_CHANGED, 0, 1);
        listener.contentsChanged(event);
    }
}
