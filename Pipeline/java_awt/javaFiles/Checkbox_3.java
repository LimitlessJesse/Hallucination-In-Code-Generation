import java.awt.*;

public class Checkbox_3 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Checkbox 1", group, true);
        Checkbox checkbox2 = new Checkbox("Checkbox 2", group, false);
        Checkbox checkbox3 = new Checkbox("Checkbox 3", group, false);

        checkbox1.setCheckboxGroup(group);
        checkbox2.setCheckboxGroup(group);
        checkbox3.setCheckboxGroup(group);
    }
}
