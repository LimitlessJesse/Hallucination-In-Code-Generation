import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_1 {
    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setValue("Hello");
        System.out.println(editor.getValue());
    }
}

class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }
}
