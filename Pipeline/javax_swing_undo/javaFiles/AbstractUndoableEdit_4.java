import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;

public class AbstractUndoableEdit_4 {
    public static void main(String[] args) {
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void redo() throws CannotRedoException {
                super.redo();
            }

            @Override
            public boolean canRedo() {
                return super.canRedo();
            }
        };

        System.out.println(undoableEdit.canRedo());
    }
}
