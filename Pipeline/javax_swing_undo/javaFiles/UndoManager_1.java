import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class UndoManager_1 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        // Perform some edits
        undoManager.edit();
        //...

        // Undo the last edit
        UndoableEdit lastEdit = undoManager.getUndoableEdit();
        if (lastEdit!= null) {
            lastEdit.undo();
        }
    }
}
