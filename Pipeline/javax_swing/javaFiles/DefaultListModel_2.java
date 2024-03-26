import javax.swing.DefaultListModel;

public class DefaultListModel_2 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.add("Hello");
        listModel.add("World");
        listModel.add(0, "New");
        System.out.println(listModel);
    }
}
