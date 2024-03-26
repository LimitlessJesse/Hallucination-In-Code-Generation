import javax.swing.undo.UndoManager;

public class UndoManager_3 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        undoManager.undo();
        System.out.println(undoManager.canUndo());
    }
}
