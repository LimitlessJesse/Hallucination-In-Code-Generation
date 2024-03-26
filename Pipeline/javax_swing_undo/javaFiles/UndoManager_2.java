import javax.swing.undo.UndoManager;

public class UndoManager_2 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        undoManager.undo();
        undoManager.redo();
    }
}
