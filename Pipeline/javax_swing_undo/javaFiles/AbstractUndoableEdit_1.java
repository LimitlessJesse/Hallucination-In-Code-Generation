import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoManager;

public class AbstractUndoableEdit_1 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        // Create a custom undoable edit
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void undo() {
                // Code to undo the changes
                System.out.println("Undoing changes...");
            }

            @Override
            public boolean canUndo() {
                // Check if undo is possible
                return true;
            }
        };

        // Add the undoable edit to the undo manager
        undoManager.addEdit(undoableEdit);

        // Undo the changes
        undoManager.undo();
    }
}
