import javax.swing.undo.UndoableEdit;
import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_5 {
    public static void main(String[] args) {
        UndoableEdit edit = new AbstractUndoableEdit() {
            @Override
            public String getPresentationName() {
                return "My Undoable Edit";
            }
        };

        System.out.println(edit.getPresentationName());
    }
}
