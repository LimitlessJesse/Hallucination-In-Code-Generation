import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotUndoException;

public class AbstractUndoableEdit_3 {
    public static void main(String[] args) {
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void undo() throws CannotUndoException {
                super.undo();
            }

            @Override
            public boolean canUndo() {
                return super.canUndo();
            }
        };

        System.out.println(undoableEdit.canUndo());
    }
}
