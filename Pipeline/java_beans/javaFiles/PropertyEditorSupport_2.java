import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_2 {
    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setValue("Hello");
        System.out.println(editor.getValue());
    }
}

class MyPropertyEditor extends PropertyEditorSupport {
    // No need to override any methods, as we only need to use getValue()
}
