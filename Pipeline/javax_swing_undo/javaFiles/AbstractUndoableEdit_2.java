import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;

public class MyUndoableEdit extends AbstractUndoableEdit {

    private String oldValue;
    private String newValue;

    public MyUndoableEdit(String oldValue, String newValue) {
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    @Override
    public void undo() {
        // Implement the logic to undo the changes
    }

    @Override
    public void redo() {
        // Implement the logic to redo the changes
    }
}
