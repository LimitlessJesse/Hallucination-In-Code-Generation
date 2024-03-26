import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ListDataEvent_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");

        ListDataEvent event = new ListDataEvent(list, ListDataEvent.CONTENTS_CHANGED, 0, list.size());
        int type = event.getType();

        System.out.println("Event type: " + type);
    }
}
