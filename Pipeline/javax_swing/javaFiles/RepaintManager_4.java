import javax.swing.RepaintManager;

public class RepaintManager_4 {
    public static void main(String[] args) {
        RepaintManager repaintManager = RepaintManager.currentManager(null);
        repaintManager.setDoubleBufferingEnabled(true);
    }
}
