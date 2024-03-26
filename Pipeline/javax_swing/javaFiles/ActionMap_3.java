import javax.swing.ActionMap;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class ActionMap_3 {
    public static void main(String[] args) {
        ActionMap actionMap = new ActionMap();
        actionMap.put("save", new AbstractAction() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Saving...");
            }
        });

        AbstractAction action = (AbstractAction) actionMap.get("save");
        action.actionPerformed(null);
    }
}
