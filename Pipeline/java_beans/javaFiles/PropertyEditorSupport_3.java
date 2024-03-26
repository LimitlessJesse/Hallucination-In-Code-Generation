import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_3 {
    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setAsText("Hello");
        System.out.println(editor.getValue());
    }
}

class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(text);
    }
}
