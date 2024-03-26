import java.awt.*;

public class Checkbox_4 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", group, true);
        Checkbox checkbox2 = new Checkbox("Option 2", group, false);
        Checkbox checkbox3 = new Checkbox("Option 3", group, false);

        // You can get the selected checkboxes like this:
        Checkbox[] selectedCheckboxes = group.getCheckboxes();
        for (Checkbox checkbox : selectedCheckboxes) {
            System.out.println(checkbox.getLabel() + " is " + (checkbox.getState()? "selected" : "not selected"));
        }
    }
}
