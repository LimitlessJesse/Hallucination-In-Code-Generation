import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class JList_DropLocation_2 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        ListModel<String> model = list.getModel();
        model.addElement("Hello");
        model.addElement("World");

        JList.DropLocation dropLocation = list.getDropLocation();
        int index = dropLocation.getIndex();

        System.out.println("Index: " + index);
    }
}
