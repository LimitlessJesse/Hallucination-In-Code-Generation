import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;

public class JList_DropLocation_4 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        ListModel<String> model = list.getModel();
        model.addElement("Hello");
        JList.DropLocation dropLocation = list.getDropLocation();
        boolean isInsert = dropLocation.isInsert();
        System.out.println(isInsert);
    }
}
