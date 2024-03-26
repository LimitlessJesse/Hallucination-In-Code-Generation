import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_4 {
    public static void main(String[] args) {
        PropertyEditorSupport editor = new PropertyEditorSupport() {
            @Override
            public String getAsText() {
                Object value = getValue();
                return value!= null? value.toString() : "";
            }
        };

        editor.setValue("Hello");
        System.out.println(editor.getAsText());
    }
}
