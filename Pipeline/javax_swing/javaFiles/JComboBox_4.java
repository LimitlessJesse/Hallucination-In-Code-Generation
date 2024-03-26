import javax.swing.JComboBox;

public class JComboBox_4 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        System.out.println("Before removing: " + comboBox);

        comboBox.removeItem("Item 2");

        System.out.println("After removing: " + comboBox);
    }
}
